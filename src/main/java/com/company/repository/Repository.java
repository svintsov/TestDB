package com.company.repository;

import java.util.List;

public interface Repository<Entity> {
    List<Entity> findAll();
}
