package com.landa.nameplatesystem.dao.impl;

import com.landa.nameplatesystem.dao.NameplateDao;
import com.landa.nameplatesystem.pojo.Nameplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NamePlateDaoImpl implements NameplateDao {

    @Override
    public List<Nameplate> getNamePlateRecoed(String filter) {
        List<Nameplate> list =null;
        String sql = "select * from tal_nameplate where 1=1" + filter;
//        Query query = getSessionFactory().getCurrentSession().createQuery(sql);
//        list = query.list();
        return list;
    }

    @Override
    public int updateByPrimaryKey(Nameplate record) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public void addNamePlateRecord(Nameplate nameplate) {

    }

    @Override
    public Nameplate selectByPrimaryKey(Integer id) {
        return null;
    }

}
