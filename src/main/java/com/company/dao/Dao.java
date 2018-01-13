package com.company.dao;

import java.sql.SQLException;

public interface Dao<Entity, Key> {
    void create(Entity model) throws SQLException;
    Entity read(Key key) throws SQLException;
    void update(Entity model) throws SQLException;
    void delete(Entity model) throws SQLException;
    void close();
}
