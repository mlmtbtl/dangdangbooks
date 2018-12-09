package com.oraclepwd.ddbookmarket.biz.impl;

import com.oraclepwd.ddbookmarket.biz.BigTypeBiz;
import com.oraclepwd.ddbookmarket.dao.BigTypeDao;
import com.oraclepwd.ddbookmarket.dao.impl.BigTypeDaoJdbcImpl;
import com.oraclepwd.ddbookmarket.model.BigType;

import java.util.List;

public class BigTypeBizImpl implements BigTypeBiz {
    @Override
    public boolean save(String name) {
        BigTypeDao bigTypeDao = new BigTypeDaoJdbcImpl();

        return bigTypeDao.save(name);
    }

    @Override
    public List<BigType> findAllBigType() {
        BigTypeDao bigTypeDao = new BigTypeDaoJdbcImpl();
        return bigTypeDao.findAll();
    }
}
