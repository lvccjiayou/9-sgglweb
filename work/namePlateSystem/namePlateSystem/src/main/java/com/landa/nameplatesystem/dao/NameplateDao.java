package com.landa.nameplatesystem.dao;

import com.landa.nameplatesystem.pojo.Nameplate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface NameplateDao {
    int deleteByPrimaryKey(Integer id);

    void addNamePlateRecord(Nameplate nameplate);

    Nameplate selectByPrimaryKey(Integer id);

    List<Nameplate> getNamePlateRecoed(String filter);

    int updateByPrimaryKey(Nameplate record);

    List<Map> getNamePlateAndUnitCode(@Param("filter")String filter);
}