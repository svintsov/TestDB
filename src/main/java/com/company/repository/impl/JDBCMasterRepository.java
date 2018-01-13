package com.company.repository.impl;

import com.company.entity.Master;
import com.company.mapper.MasterMapper;
import com.company.repository.MasterRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCMasterRepository implements MasterRepository {
    private final Connection connection;

    public JDBCMasterRepository(Connection connection){
        this.connection=connection;
    }

    @Override
    public List<Master> findAll() {
        List<Master> result = new ArrayList<>();

        try(PreparedStatement statement = connection.prepareStatement(SQLMasterRepository.FIND_ALL.QUERY)){
            final ResultSet rs = statement.executeQuery();
            MasterMapper masterMapper = new MasterMapper();
            while(rs.next()){
                Master master = masterMapper.extractFromResultSet(rs);
                result.add(master);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }

    enum SQLMasterRepository{
        FIND_ALL("SELECT * FROM emps e join positions p using(idpositions) where p.name <> \"administrator\";");

        SQLMasterRepository(String QUERY) {
            this.QUERY = QUERY;
        }

        String QUERY;
    }
}
