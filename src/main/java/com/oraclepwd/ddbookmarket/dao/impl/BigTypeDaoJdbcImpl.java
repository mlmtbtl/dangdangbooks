package com.oraclepwd.ddbookmarket.dao.impl;

import com.oraclepwd.ddbookmarket.dao.BigTypeDao;
import com.oraclepwd.ddbookmarket.model.BigType;
import com.oraclepwd.ddbookmarket.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BigTypeDaoJdbcImpl implements BigTypeDao {
    @Override
    public boolean save(String name) {
        Connection conn =null;
        PreparedStatement stmt =null;
        try {
            conn = DBUtil.getConnection();
            String sql ="insert into t_big_type values(default,?)";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,name);
            int ret =stmt.executeUpdate();
            if (ret > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //释放资源
            DBUtil.free(stmt,conn);
        }
        return false;
    }

    @Override
    public List<BigType> findAll() {
        Connection conn = null;
        Statement stmt =null;
        ResultSet rs= null;
        try {
            conn=DBUtil.getConnection();
            stmt=conn.createStatement();
            String sql ="select * from t_big_type";
            rs=stmt.executeQuery(sql);
            List<BigType> ls = new ArrayList<>();
            while (rs.next()){
                BigType bigType =new BigType();
                bigType.setId(rs.getInt("id"));
                bigType.setName(rs.getString("name"));
                ls.add(bigType);
            }
            return  ls;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.free(rs,stmt,conn);
        }
        return null;
    }

}
