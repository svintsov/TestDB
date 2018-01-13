package com.company.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface AbstractMapper<Entity> {

    Entity extractFromResultSet(ResultSet rs) throws SQLException;

}
