package com.oraclepwd.tear.biz.impl;

import com.oraclepwd.tear.biz.BigTypeBiz;
import com.oraclepwd.tear.dao.BigTypeDao;
import com.oraclepwd.tear.dao.impl.BigTypeDaoJdbcImpl;

public class BigTypeBizImpl implements BigTypeBiz {

	public boolean save(String name) {
		BigTypeDao bigTypeDao = new BigTypeDaoJdbcImpl();
		
		return bigTypeDao.save(name);
	}
 
}
