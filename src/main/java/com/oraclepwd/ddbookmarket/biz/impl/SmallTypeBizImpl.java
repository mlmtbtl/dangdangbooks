package com.oraclepwd.ddbookmarket.biz.impl;

import com.oraclepwd.ddbookmarket.biz.SmallTypeBiz;
import com.oraclepwd.ddbookmarket.dao.SmallTypeDao;
import com.oraclepwd.ddbookmarket.dao.impl.SmallTypeDaoJdbcImpl;
import com.oraclepwd.ddbookmarket.model.SmallType;

public class SmallTypeBizImpl implements SmallTypeBiz {
    @Override
    public boolean save(SmallType smallType) {
        SmallTypeDao smallTypeDao = new SmallTypeDaoJdbcImpl();

        return smallTypeDao.save(smallTypeDao);
    }
}
