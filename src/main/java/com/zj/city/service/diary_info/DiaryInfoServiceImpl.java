package com.zj.city.service.diary_info;

import com.zj.city.dao.diary_info.DiaryInfoDao;
import com.zj.city.domain.DiaryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * ClassName:DiaryInfoServiceImpl
 * Package:com.zj.city.service.diary_info
 * Description:
 *
 * @Date:2020/5/6 8:11
 * @Author:zijiu@1008611
 */
@Service
public class DiaryInfoServiceImpl implements DiaryInfoService{
    @Autowired
    private DiaryInfoDao diaryInfoDao;

    @Override
    public List<DiaryInfo> findAll() {
        return diaryInfoDao.findAll();
    }

    @Override
    public DiaryInfo findById(String uId, String id) {
        return diaryInfoDao.findById(uId,id);
    }

    @Override
    public List<DiaryInfo> findByUserId(String userId) {
        return diaryInfoDao.findByUserId(userId);
    }

    @Override
    public List<DiaryInfo> findByStatusGfEx() {
        return diaryInfoDao.findByStatusGfEx();
    }

    @Override
    public void add(DiaryInfo diaryInfo) {

        Date now = new Date();
        diaryInfo.setUpdateTime(now);
        diaryInfo.setStatusGf(0);
        diaryInfo.setStatus(1);
        diaryInfo.setViewCount(100);
        diaryInfoDao.add(diaryInfo);


    }

    @Override
    public void update(DiaryInfo diaryInfo) {
        Date now = new Date();
        diaryInfo.setUpdateTime(now);
        diaryInfo.setStatusGf(0);
        diaryInfo.setStatus(1);
        diaryInfo.setViewCount(100);
        diaryInfoDao.update(diaryInfo);
    }




}
