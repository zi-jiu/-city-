package com.zj.city.dao.article_info;

import com.zj.city.domain.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:ArticleInfoDao
 * Package:com.zj.city.dao.article_info
 * Description:
 *
 * @Date:2020/5/16 8:02
 * @Author:zijiu@1008611
 */
@Mapper
public interface ArticleInfoDao {

    List<ArticleInfo> findAll();

    Integer add(ArticleInfo articleInfo);

    ArticleInfo findById(String uId, String id);

    List<ArticleInfo> findByUserId(String userId);

    List<ArticleInfo> findAllByView();

    List<ArticleInfo> findAllByTypeId(String typeId);
}
