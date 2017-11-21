package com.hainet.spring.tx.sample.domain.service;

import com.hainet.spring.tx.sample.domain.dao.Dao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ServiceB {

    private final Dao dao;

    @Transactional
    public void insertWithTransaction() {
        // insert 2
        dao.insert();
    }

    public void insertWithNoTransaction() {
        // insert 2
        dao.insert();
    }

    @Transactional
    public void insertWithTransactionExceptionPointTwo() {
        // insert 2
        dao.insert();

        // exception 2
        throw new RuntimeException();
    }

    public void insertWithNoTransactionExceptionPointTwo() {
        // insert 2
        dao.insert();

        // exception 2
        throw new RuntimeException();
    }
}
