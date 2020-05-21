package com.zj.city.service.article_info;

import com.zj.city.dao.article_info.ArticleInfoDao;
import com.zj.city.domain.ArticleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * ClassName:ArticleInfoServiceImpl
 * Package:com.zj.city.service.article_info
 * Description:
 *
 * @Date:2020/5/16 7:59
 * @Author:zijiu@1008611
 */
@Service
public class ArticleInfoServiceImpl implements ArticleInfoService{

    @Autowired
    private ArticleInfoDao articleInfoDao;

    @Override
    public List<ArticleInfo> findAll() {
        return articleInfoDao.findAll();
    }

    @Override
    public Integer add(ArticleInfo articleInfo) {
        Date now = new Date();
        articleInfo.setUpdateTime(now);
        articleInfo.setStatus(1);
        articleInfo.setViewCount(100);
        return articleInfoDao.add(articleInfo);
    }

    @Override
    public ArticleInfo findById(String uId, String id) {
        return articleInfoDao.findById(uId,id);
    }

    @Override
    public List<ArticleInfo> findByUserId(String userId) {
        return articleInfoDao.findByUserId(userId);
    }

    @Override
    public List<ArticleInfo> findAllByView() {
        return articleInfoDao.findAllByView();
    }

    @Override
    public List<ArticleInfo> findAllByTypeId(String typeId) {
        return articleInfoDao.findAllByTypeId(typeId);
    }

}
