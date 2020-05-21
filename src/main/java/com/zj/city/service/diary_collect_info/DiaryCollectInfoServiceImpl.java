package com.zj.city.service.diary_collect_info;


import com.zj.city.dao.diary_collect_info.DiaryCollectInfoDao;
import com.zj.city.domain.DiaryCollectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:DiaryCollectInfoServiceImpl
 * Package:com.zj.city.service.diary_collect_info
 * Description:
 *
 * @Date:2020/5/11 17:32
 * @Author:zijiu@1008611
 */
@Service
public class DiaryCollectInfoServiceImpl implements DiaryCollectInfoService{

    @Autowired
    private DiaryCollectInfoDao diaryCollectInfoDao;

    @Override
    public void updateCollectStatus(String dId, String uId, Integer collectStatus) {
        Integer upCollectStatus = 0;  //随便先默认一个，默认未收藏
        if (collectStatus==0) {  //如果未收藏则变为收藏
            upCollectStatus = 1;
        }
        diaryCollectInfoDao.updateCollectStatus(dId,uId,upCollectStatus);
    }

    @Override
    public DiaryCollectInfo selectCollectStatus(String dId, String uId) {
        return diaryCollectInfoDao.selectCollectStatus(dId,uId);
    }

    @Override
    public void insertCollectStatus(String dId, String uId, Integer collectStatus) {
        collectStatus=1;
        diaryCollectInfoDao.insertCollectStatus(dId,uId,collectStatus);
    }

    @Override
    public void insertGoodStatus(String dId, String uId, Integer goodStatus) {
        goodStatus=1;
        diaryCollectInfoDao.insertGoodStatus(dId,uId,goodStatus);
    }

    @Override
    public void updateGoodStatus(String dId, String uId, Integer goodStatus) {
        Integer upGoodStatus = 0;  //随便先默认一个，默认未收藏
        if (goodStatus==0) {  //如果未收藏则变为收藏
            upGoodStatus = 1;
        }
        diaryCollectInfoDao.updateGoodStatus(dId,uId,upGoodStatus);
    }

    @Override
    public void add(String dId, String uId) {
        diaryCollectInfoDao.add(dId,uId);
    }
}