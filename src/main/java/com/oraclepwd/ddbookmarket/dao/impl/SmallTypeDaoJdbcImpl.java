package com.oraclepwd.ddbookmarket.dao.impl;

import com.oraclepwd.ddbookmarket.dao.SmallTypeDao;
import com.oraclepwd.ddbookmarket.model.SmallType;
import com.oraclepwd.ddbookmarket.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SmallTypeDaoJdbcImpl implements SmallTypeDao {
    @Override
    public boolean save(SmallType smallTypeDao) {
        Connection conn=null;
        PreparedStatement stmt =null;
        try {
            conn = DBUtil.getConnection();
            stmt=conn.prepareStatement("insert into  t_small_type values(default,?,?)");
            stmt.setString(1,smallTypeDao.getName());
            stmt.setInt(2,smallTypeDao.getBid());
            int ret =stmt.executeUpdate();
            if (ret>0){
                return  true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.free(stmt,conn);
        }
        return false;
    }

    @Override
    public boolean save(SmallTypeDao smallTypeDao) {

        return false;
    }
}
