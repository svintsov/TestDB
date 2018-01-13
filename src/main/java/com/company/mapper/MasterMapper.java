package com.company.mapper;

import com.company.entity.Master;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MasterMapper implements AbstractMapper<Master> {
    @Override
    public Master extractFromResultSet(ResultSet rs) throws SQLException {
        Master result = new Master();
        result.setId(rs.getInt("idemps"));
        result.setName(rs.getString("emps.name"));
        result.setSecondName(rs.getString("emps.secondname"));
        result.setPosition(rs.getString("positions.name"));
        return result;
    }
}
