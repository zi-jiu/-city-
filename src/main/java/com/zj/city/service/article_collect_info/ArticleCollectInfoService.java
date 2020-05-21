package com.zj.city.service.article_collect_info;

import com.zj.city.domain.ArticleCollectInfo;

/**
 * ClassName:ArticleCollectInfoService
 * Package:com.zj.city.service.article_collect_info
 * Description:
 *
 * @Date:2020/5/17 12:26
 * @Author:zijiu@1008611
 */
public interface ArticleCollectInfoService {
    void add(String dId, String uId);

    ArticleCollectInfo selectCollectStatus(String dId, String uId);

    void insertCollectStatus(String dId, String uId, Integer collectStatus);

    void updateCollectStatus(String dId, String uId, Integer collectStatus);

    ArticleCollectInfo selectGoodStatues(String dId, String uId);

    void insertGoodStatues(String dId, String uId, Integer goodStatus);

    void updateGoodStatues(String dId, String uId, Integer goodStatus);
}
