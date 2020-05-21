package com.zj.city.dao.diary_collect_info;

import com.zj.city.domain.DiaryCollectInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:DiaryCollectInfoDao
 * Package:com.zj.city.dao.diary_collect_info
 * Description:
 *
 * @Date:2020/5/11 17:36
 * @Author:zijiu@1008611
 */
@Mapper
public interface DiaryCollectInfoDao {
    DiaryCollectInfo selectCollectStatus(String dId, String uId);

    void updateCollectStatus(String dId, String uId, Integer collectStatus);

    void insertCollectStatus(String dId, String uId, Integer collectStatus);

    void updateGoodStatus(String dId, String uId, Integer goodStatus);

    void insertGoodStatus(String dId, String uId, Integer goodStatus);

    void add(String dId, String uId);
}
