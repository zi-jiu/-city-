package com.zj.city.service.article_collect_info;

import com.zj.city.dao.article_collect_info.ArticleCollectInfoDao;
import com.zj.city.domain.ArticleCollectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:ArticleCollectInfoServiceImpl
 * Package:com.zj.city.service.article_collect_info
 * Description:
 *
 * @Date:2020/5/17 12:27
 * @Author:zijiu@1008611
 */
@Service
public class ArticleCollectInfoServiceImpl implements ArticleCollectInfoService {

    @Autowired
    private ArticleCollectInfoDao articleCollectInfoDao;

    @Override
    public void add(String dId, String uId) {
        articleCollectInfoDao.add(dId,uId);
    }

    @Override
    public ArticleCollectInfo selectCollectStatus(String dId, String uId) {
        return articleCollectInfoDao.selectCollectStatus(dId,uId);
    }

    @Override
    public void insertCollectStatus(String dId, String uId, Integer collectStatus) {
        collectStatus=1;
        articleCollectInfoDao.insertCollectStatus(dId,uId,collectStatus);
    }

    @Override
    public void updateCollectStatus(String dId, String uId, Integer collectStatus) {
        Integer upCollectStatus = 0;  //随便先默认一个，默认未收藏
        if (collectStatus==0) {  //如果未收藏则变为收藏
            upCollectStatus = 1;
        }
        articleCollectInfoDao.updateCollectStatus(dId,uId,upCollectStatus);
    }

    @Override
    public ArticleCollectInfo selectGoodStatues(String dId, String uId) {
        return articleCollectInfoDao.selectGoodStatues(dId,uId);
    }

    @Override
    public void insertGoodStatues(String dId, String uId, Integer goodStatus) {
        goodStatus=1;
        articleCollectInfoDao.insertGoodStatues(dId,uId,goodStatus);
    }

    @Override
    public void updateGoodStatues(String dId, String uId, Integer goodStatus) {
        Integer upGoodStatues = 0;  //随便先默认一个，默认未收藏
        if (goodStatus==0) {  //如果未收藏则变为收藏
            upGoodStatues = 1;
        }
        articleCollectInfoDao.updateGoodStatues(dId,uId,upGoodStatues);
    }
}
