package com.zj.city.controller.article_info;

import com.zj.city.domain.*;
import com.zj.city.exception.MyException;
import com.zj.city.service.article_collect_info.ArticleCollectInfoService;
import com.zj.city.service.article_info.ArticleInfoService;
import com.zj.city.service.article_photo_info.ArticlePhotoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * ClassName:ArticleInfoController
 * Package:com.zj.city.controller.article_info
 * Description:
 *
 * @Date:2020/5/16 7:56
 * @Author:zijiu@1008611
 */
@Controller
@RequestMapping("article")
public class ArticleInfoController {

    @Autowired
    private ArticleInfoService articleInfoService;

    @Autowired
    private ArticlePhotoInfoService articlePhotoInfoService;

    @Autowired
    private ArticleCollectInfoService articleCollectInfoService;


    //查询所有已审核（没有删除的）
    @GetMapping(value = "findAll")
    @ResponseBody
    public List<ArticleInfo> findAll(){
        List<ArticleInfo> list = articleInfoService.findAll();
        return list;
    }

    //按首页分类查找,最热,风景,美食。
    @GetMapping(value = "findAllByTypeId")
    @ResponseBody
    public List<ArticleInfo> findAllByTypeId(HttpServletRequest request){
        String typeId = request.getParameter("typeId");
        int typeId1 = Integer.parseInt(typeId);
        List<ArticleInfo> list;
        if(typeId1 == 0){  //最热按view查
            list = articleInfoService.findAllByView();
        }else{
            list = articleInfoService.findAllByTypeId(typeId);
        }
        return list;
    }


    //根据游记id查询游记详情
    @PostMapping(value = "findById")
    @ResponseBody
    public Map findById(ModelMap map, HttpServletRequest request){
        String id = request.getParameter("id");
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        String uId = userInfo.getId();
        ArticleInfo articleInfo = articleInfoService.findById(uId,id);
        List<ArticlePhotoInfo> photo=articlePhotoInfoService.findById(id);
        Map<String,Object> map1 = new HashMap<>();
        if(articleInfo==null){
            String dId = id;
            articleCollectInfoService.add(dId,uId);
            articleInfo = articleInfoService.findById(uId,id);
        }
        map1.put("art",articleInfo);
        map1.put("photo",photo);
        return map1;
    }

    //根据用户id查询游记详情
    @GetMapping(value = "findByUserId")
    @ResponseBody
    public Map findByUserId(ModelMap map, HttpServletRequest request){
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        String uId = userInfo.getId();
        List<ArticleInfo> articleInfoList = articleInfoService.findByUserId(uId);
        int uId1 = Integer.parseInt(uId);
        List<ArticlePhotoInfo> photo=articlePhotoInfoService.findByUserId(uId1);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("art",articleInfoList);
        map1.put("photo",photo);
        return map1;
    }


    //写文章
    @PostMapping(value = "add")
    @ResponseBody
    public String add(ArticleInfo articleInfo,@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        //添加文字
        if(articleInfo.getContent()==null){
            throw new MyException(0,"操作失败,您没有提交有效数据");
        }
        //System.out.println(request.getSession().getAttribute("userInfo").toString());
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        articleInfo.setUserId(userInfo.getId());
        //articleInfo.setUserId(5); 写死用户测试用
        String uId = userInfo.getId();
        Integer dId = articleInfoService.add(articleInfo);

        //添加图片到本地磁盘
        //文件名称
        String szFileName = file.getOriginalFilename();
        //重命名后的文件名称
        String szNewFileName="";
        //根据日期自动创建三级目录
        String szDateFolder = "";

        //上传文件
        if(file!=null && szFileName!=null && szFileName.length()>0){
            Date date = new Date();
            szDateFolder = new SimpleDateFormat("yyyy/MM/dd").format(date);

            //存储文件物理路径
            String szDatePath = "D:/upload/"+szDateFolder;
            //自动创建文件夹
            File f = new File(szDatePath);
            if(!f.exists()){
                f.mkdirs();
            }
            //新的文件名
            szNewFileName = UUID.randomUUID()+szFileName.substring(szFileName.lastIndexOf("."));
            //新文件
            File newFile = new File(szDatePath+"/"+szNewFileName);
            //将内存中的数据写入磁盘
            file.transferTo(newFile);
        }
        System.out.println("进来上传文件了");
        String imgUrl ="http://x30744r750.oicp.vip/city/upload/"+szDateFolder+"/"+szNewFileName;

        System.out.println("-----------------"+imgUrl);
        articlePhotoInfoService.add(dId,imgUrl,uId);

        return imgUrl;
    }


}
