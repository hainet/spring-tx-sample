package com.hainet.spring.tx.sample.domain.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class Dao {

    private final JdbcTemplate jdbc;

    public int insert() {
        return jdbc.update("INSERT INTO model (id) VALUES (null)");
    }
}
