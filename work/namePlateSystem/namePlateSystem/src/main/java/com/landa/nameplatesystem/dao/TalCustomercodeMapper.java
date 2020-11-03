package com.landa.nameplatesystem.dao;

import com.landa.nameplatesystem.pojo.TalCustomercode;
import java.util.List;

public interface TalCustomercodeMapper {
    int deleteByPrimaryKey(String cUnitcode);

    int insert(TalCustomercode record);

    TalCustomercode selectByPrimaryKey(String cUnitcode);

    List<TalCustomercode> selectAll();

    int updateByPrimaryKey(TalCustomercode record);
}