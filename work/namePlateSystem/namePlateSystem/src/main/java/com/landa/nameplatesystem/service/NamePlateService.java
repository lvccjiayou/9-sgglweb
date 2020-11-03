package com.landa.nameplatesystem.service;

import com.landa.nameplatesystem.pojo.Nameplate;

import java.util.List;
import java.util.Map;

public interface NamePlateService {
    List<Map> getNamePlateAndUnitCode(String filter);

    void addNamePlateRecord(Nameplate nameplate);

    void deleteNamePlateRecord();

    void updateNamePlateRecord();
}
