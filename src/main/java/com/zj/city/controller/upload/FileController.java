package com.zj.city.controller.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 文件上传
 */
@Controller
@RequestMapping("upload")
public class FileController {

    @GetMapping(value = "file")
    public String file() {
        return "file";
    }

    @PostMapping(value = "imageUpload")
    @ResponseBody
    public String imageUpload(@RequestParam(value = "file")MultipartFile file, HttpServletRequest request)throws IOException{
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
            szNewFileName =UUID.randomUUID()+szFileName.substring(szFileName.lastIndexOf("."));
            //新文件
            File newFile = new File(szDatePath+"/"+szNewFileName);
            //将内存中的数据写入磁盘
            file.transferTo(newFile);
        }
        System.out.println("进来上传文件了");
        String imgUrl ="http://x30744r750.oicp.vip/city/upload/"+szDateFolder+"/"+szNewFileName;
        return imgUrl;
    }
}
