package com.zj.city.service.article_photo_info;

import com.zj.city.domain.ArticlePhotoInfo;

import java.util.List;

/**
 * ClassName:ArticlePhotoInfoService
 * Package:com.zj.city.service.article_photo_info
 * Description:
 *
 * @Date:2020/5/17 9:10
 * @Author:zijiu@1008611
 */
public interface ArticlePhotoInfoService {

    void add(Integer dId, String imgUrl,String uId);

    List<ArticlePhotoInfo> findById(String id);

    List<ArticlePhotoInfo> findByUserId(int uId);
}
