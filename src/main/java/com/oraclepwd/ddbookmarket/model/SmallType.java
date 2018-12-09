package com.oraclepwd.ddbookmarket.model;

import java.io.Serializable;

public class SmallType implements Serializable {
    private static final long serialVersionUID =1L;
    private int id;
    private String name;
    private  int bid;
    public SmallType(){

    }

    public int getBid() {
        return bid;
    }

    public SmallType setBid(int bid) {
        this.bid = bid;
        return this;
    }

    public String getName() {
        return name;
    }

    public SmallType setName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return id;
    }

    public SmallType setId(int id) {
        this.id = id;
        return this;
    }
}
