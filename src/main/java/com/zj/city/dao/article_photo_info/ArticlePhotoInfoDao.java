package com.zj.city.dao.article_photo_info;

import com.zj.city.domain.ArticlePhotoInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:ArticlePhotoInfoDao
 * Package:com.zj.city.dao.article_photo_info
 * Description:
 *
 * @Date:2020/5/17 9:24
 * @Author:zijiu@1008611
 */
@Mapper
public interface ArticlePhotoInfoDao {
    void add(Integer dId, String photo,String uId);

    List<ArticlePhotoInfo> findById(String dId);

    List<ArticlePhotoInfo> findByUserId(int uId);
}
