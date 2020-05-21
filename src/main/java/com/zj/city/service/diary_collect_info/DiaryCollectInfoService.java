package com.zj.city.service.diary_collect_info;

import com.zj.city.domain.DiaryCollectInfo;

/**
 * ClassName:DiaryCollectInfoService
 * Package:com.zj.city.service.diaty_collect_info
 * Description:
 *
 * @Date:2020/5/11 17:29
 * @Author:zijiu@1008611
 */
public interface DiaryCollectInfoService {

    void updateCollectStatus(String dId, String uId, Integer collectStatus);

    DiaryCollectInfo selectCollectStatus(String dId, String uId);

    void insertCollectStatus(String dId, String uId, Integer collectStatus);

    void insertGoodStatus(String dId, String uId, Integer goodStatus);

    void updateGoodStatus(String dId, String uId, Integer goodStatus);

    void add(String dId, String uId);
}
