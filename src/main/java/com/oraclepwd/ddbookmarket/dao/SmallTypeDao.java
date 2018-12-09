package com.oraclepwd.ddbookmarket.dao;

import com.oraclepwd.ddbookmarket.model.SmallType;

public interface SmallTypeDao {
     boolean save(SmallType smallType) ;

     boolean save(SmallTypeDao smallTypeDao);
}