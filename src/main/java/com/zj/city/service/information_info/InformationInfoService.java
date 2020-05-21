package com.zj.city.service.information_info;

import com.zj.city.domain.InformationInfo;

import java.util.List;

/**
 * ClassName:InformationInfoService
 * Package:com.zj.city.service.information_info
 * Description:
 *
 * @Date:2020/5/13 8:51
 * @Author:zijiu@1008611
 */
public interface InformationInfoService {

    List<InformationInfo> findAllByCityType(Integer cityTypeId);

    List<InformationInfo> findAllByTypeId(Integer cityTypeId,Integer typeId);

    List<InformationInfo> findAllById(Integer cityTypeId);
}
