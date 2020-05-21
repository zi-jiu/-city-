package com.zj.city.dao.article_collect_info;

import com.zj.city.domain.ArticleCollectInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:ArticleCollectInfoDao
 * Package:com.zj.city.dao.article_collect_info
 * Description:
 *
 * @Date:2020/5/17 12:34
 * @Author:zijiu@1008611
 */
@Mapper
public interface ArticleCollectInfoDao {
    void add(String dId, String uId);

    void insertCollectStatus(String dId, String uId, Integer collectStatus);

    void updateCollectStatus(String dId, String uId, Integer collectStatus);

    ArticleCollectInfo selectCollectStatus(String dId, String uId);

    ArticleCollectInfo selectGoodStatues(String dId, String uId);

    void insertGoodStatues(String dId, String uId, Integer goodStatus);

    void updateGoodStatues(String dId, String uId, Integer goodStatus);
}
