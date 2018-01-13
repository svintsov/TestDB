package com.company.dao;

import com.company.entity.User;

public interface UserDao extends Dao<User,Integer> {
    User read(String login);
}
