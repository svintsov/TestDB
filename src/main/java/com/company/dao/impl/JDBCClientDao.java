package com.company.dao.impl;

import com.company.dao.ClientDao;
import com.company.entity.Client;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCClientDao implements ClientDao {
    private final Connection connection;

    public JDBCClientDao(Connection connection) {
        this.connection=connection;
    }

    @Override
    public void create(Client model) {

    }

    @Override
    public Client read(Integer integer) {
        return null;
    }

    @Override
    public void update(Client model) {

    }

    @Override
    public void delete(Client model) {

    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
