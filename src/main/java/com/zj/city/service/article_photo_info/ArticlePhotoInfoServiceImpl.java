package com.zj.city.service.article_photo_info;

import com.zj.city.dao.article_photo_info.ArticlePhotoInfoDao;
import com.zj.city.domain.ArticlePhotoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:ArticlePhotoInfoServiceImpl
 * Package:com.zj.city.service.article_photo_info
 * Description:
 *
 * @Date:2020/5/17 9:10
 * @Author:zijiu@1008611
 */
@Service
public class ArticlePhotoInfoServiceImpl implements ArticlePhotoInfoService{

    @Autowired
    private ArticlePhotoInfoDao articlePhotoInfoDao;

    @Override
    public void add(Integer dId, String imgUrl,String uId) {
        articlePhotoInfoDao.add(dId,imgUrl,uId);
    }

    @Override
    public List<ArticlePhotoInfo> findById(String id) {
        return articlePhotoInfoDao.findById(id);
    }

    @Override
    public List<ArticlePhotoInfo> findByUserId(int uId) {
        return articlePhotoInfoDao.findByUserId(uId);
    }
}
