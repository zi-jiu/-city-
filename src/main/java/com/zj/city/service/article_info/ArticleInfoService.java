package com.zj.city.service.article_info;

import com.zj.city.domain.ArticleInfo;

import java.util.List;

/**
 * ClassName:ArticleInfoService
 * Package:com.zj.city.service.article_info
 * Description:
 *
 * @Date:2020/5/16 7:59
 * @Author:zijiu@1008611
 */
public interface ArticleInfoService {
    List<ArticleInfo> findAll();

    Integer add(ArticleInfo articleInfo);

    ArticleInfo findById(String uId, String id);

    List<ArticleInfo> findByUserId(String userId);

    List<ArticleInfo> findAllByView();

    List<ArticleInfo> findAllByTypeId(String typeId);
}
