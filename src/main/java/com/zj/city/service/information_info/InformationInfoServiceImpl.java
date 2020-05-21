package com.zj.city.service.information_info;

import com.zj.city.dao.information_info.InformationInfoDao;
import com.zj.city.domain.InformationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:InformationInfoServiceImpl
 * Package:com.zj.city.service.information_info
 * Description:
 *
 * @Date:2020/5/13 8:51
 * @Author:zijiu@1008611
 */
@Service
public class InformationInfoServiceImpl implements InformationInfoService {

    @Autowired
    private InformationInfoDao informationInfoDao;


    @Override
    public List<InformationInfo> findAllByCityType(Integer cityTypeId) {
        //按typeid查询就会增加type表里的viewCount,城市热度指数
        informationInfoDao.updateCityViewCount(cityTypeId);

        List list = informationInfoDao.findAllByCityType(cityTypeId);
        return list;
    }

    @Override
    public List<InformationInfo> findAllByTypeId(Integer cityTypeId,Integer typeId) {
        //加一个按typeid查询就会增加type表里的viewCount,城市热度指数
        List list = informationInfoDao.findAllByTypeId(cityTypeId,typeId);
        return list;
    }

    @Override
    public List<InformationInfo> findAllById(Integer id) {
        List list = informationInfoDao.findAllById(id);
        return list;
    }
}
