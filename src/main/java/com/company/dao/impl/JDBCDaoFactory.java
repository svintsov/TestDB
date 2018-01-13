package com.company.dao.impl;

import com.company.dao.ClientDao;
import com.company.dao.DaoFactory;
import com.company.dao.MasterDao;
import com.company.dao.UserDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {

    private DataSource dataSource = ConnectionPoolHolder.getDataSource();

    @Override
    public UserDao createUserDao() {
        return new JDBCUserDao(getConnection());
    }
    @Override
    public ClientDao createClientDao() {
        return new JDBCClientDao(getConnection());
    }

    @Override
    public MasterDao createMasterDao(){
        return new JDBCMasterDao(getConnection());
    }

    private Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}