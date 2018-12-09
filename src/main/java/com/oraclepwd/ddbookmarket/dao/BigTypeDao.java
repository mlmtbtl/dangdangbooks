package com.oraclepwd.ddbookmarket.dao;

import com.oraclepwd.ddbookmarket.model.BigType;

import java.util.List;

public interface BigTypeDao {
    boolean save(String name);

    List<BigType> findAll();
}
