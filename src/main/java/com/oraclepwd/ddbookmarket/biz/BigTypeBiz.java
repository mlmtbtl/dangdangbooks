package com.oraclepwd.ddbookmarket.biz;

import com.oraclepwd.ddbookmarket.model.BigType;

import java.util.List;

public interface BigTypeBiz {
    boolean save(String name);

    List<BigType> findAllBigType();
}
