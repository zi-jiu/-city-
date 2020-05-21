package com.zj.city.dao.diary_info;

import com.zj.city.domain.DiaryInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:DiaryInfoDao
 * Package:com.zj.city.dao.diary_info
 * Description:
 *
 * @Date:2020/5/6 8:22
 * @Author:zijiu@1008611
 */
@Mapper
public interface DiaryInfoDao {

    List<DiaryInfo> findAll();

    DiaryInfo findById(String uId, String id);

    List<DiaryInfo> findByUserId(String userId);

    List<DiaryInfo> findByStatusGfEx();

    void add(DiaryInfo diaryInfo);

    void update(DiaryInfo diaryInfo);

}
