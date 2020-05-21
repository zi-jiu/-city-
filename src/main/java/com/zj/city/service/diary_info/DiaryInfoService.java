package com.zj.city.service.diary_info;

import com.zj.city.domain.DiaryInfo;

import java.util.List;

/**
 * ClassName:DiaryInfoService
 * Package:com.zj.city.service.diary_info
 * Description:
 *
 * @Date:2020/5/6 8:11
 * @Author:zijiu@1008611
 */
public interface DiaryInfoService {

    //查询所有游记
    List<DiaryInfo> findAll();


    //根据id查游记
    DiaryInfo findById(String uId, String id);

    List<DiaryInfo> findByUserId(String userId);

    List<DiaryInfo> findByStatusGfEx();

    void add(DiaryInfo diaryInfo);

    void update(DiaryInfo diaryInfo);

}
