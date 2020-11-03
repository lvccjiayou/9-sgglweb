package com.landa.nameplatesystem.service.impl;

import com.landa.nameplatesystem.dao.NameplateDao;
import com.landa.nameplatesystem.pojo.Nameplate;
import com.landa.nameplatesystem.service.NamePlateService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("namePlateService")
@SuppressWarnings("all")
public class NamePlateServiceImpl implements NamePlateService {

    @Autowired
    private NameplateDao nameplateDao;

    @Override
    public List<Map> getNamePlateAndUnitCode(String filter) {
        List<Map> list = nameplateDao.getNamePlateAndUnitCode(filter);
        return list;
    }

    @Override
    public void addNamePlateRecord(Nameplate nameplate) {

    }

    @Override
    public void deleteNamePlateRecord() {

    }

    @Override
    public void updateNamePlateRecord() {

    }
}
