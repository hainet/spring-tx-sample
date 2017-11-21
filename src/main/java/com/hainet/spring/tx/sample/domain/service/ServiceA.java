package com.hainet.spring.tx.sample.domain.service;

import com.hainet.spring.tx.sample.domain.dao.Dao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ServiceA {

    private final Dao dao;
    private final ServiceB serviceB;

    @Transactional
    public void 遷移_A_状態_A有効_シナリオ_insert1_exception1() {
        System.out.println("遷移：A");
        System.out.println("状態：A有効");
        System.out.println("シナリオ：insert 1 -> exception 1");

        // insert 1
        dao.insert();

        // exception 1
        throw new RuntimeException();
    }

    public void 遷移_A_状態_A無効_シナリオ_insert1_exception1() {
        System.out.println("遷移：A");
        System.out.println("状態：A無効");
        System.out.println("シナリオ：insert 1 -> exception 1");

        // insert 1
        dao.insert();

        // exception 1
        throw new RuntimeException();
    }

    @Transactional
    public void 遷移_A1A2_状態_A1有効_A2有効_シナリオ_insert1_insert2_exception2() {
        System.out.println("遷移：A1A2");
        System.out.println("状態：A1有効, A2有効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> exception 2");

        // insert 1
        dao.insert();

        // insert 2
        // exception 2
        insertWithTransactionExceptionPointTwo();
    }


    @Transactional
    public void 遷移_A1A2_状態_A1有効_A2無効_シナリオ_insert1_insert2_exception2() {
        System.out.println("遷移：A1A2");
        System.out.println("状態：A1有効, A2無効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> exception 2");

        // insert 1
        dao.insert();

        // insert 2
        // exception 2
        insertWithNoTransactionExceptionPointTwo();
    }

    public void 遷移_A1A2_状態_A1無効_A2有効_シナリオ_insert1_insert2_exception2() {
        System.out.println("遷移：A1A2");
        System.out.println("状態：A1無効, A2有効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> exception 2");

        // insert 1
        dao.insert();

        // insert 2
        // exception 2
        insertWithTransactionExceptionPointTwo();
    }

    public void 遷移_A1A2_状態_A1無効_A2無効_シナリオ_insert1_insert2_exception2() {
        System.out.println("遷移：A1A2");
        System.out.println("状態：A1無効, A2無効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> exception 2");

        // insert 1
        dao.insert();

        // insert 2
        // exception 2
        insertWithNoTransactionExceptionPointTwo();
    }

    @Transactional
    public void 遷移_AB_状態_A有効_B有効_シナリオ_insert1_insert2_exception2() {
        System.out.println("遷移：AB");
        System.out.println("状態：A有効, B有効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> exception 2");

        // insert 1
        dao.insert();

        // insert 2
        // exception 2
        serviceB.insertWithTransactionExceptionPointTwo();
    }

    @Transactional
    public void 遷移_AB_状態_A有効_B無効_シナリオ_insert1_insert2_exception2() {
        System.out.println("遷移：AB");
        System.out.println("状態：A有効, B無効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> exception 2");

        // insert 1
        dao.insert();

        // insert 2
        // exception 2
        serviceB.insertWithNoTransactionExceptionPointTwo();
    }

    public void 遷移_AB_状態_A無効_B有効_シナリオ_insert1_insert2_exception2() {
        System.out.println("遷移：AB");
        System.out.println("状態：A無効, B有効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> exception 2");

        // insert 1
        dao.insert();

        // insert 2
        // exception 2
        serviceB.insertWithTransactionExceptionPointTwo();
    }

    public void 遷移_AB_状態_A無効_B無効_シナリオ_insert1_insert2_exception2() {
        System.out.println("遷移：AB");
        System.out.println("状態：A無効, B無効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> exception 2");

        // insert 1
        dao.insert();

        // insert 2
        // exception 2
        serviceB.insertWithNoTransactionExceptionPointTwo();
    }

    @Transactional
    public void 遷移_A1A2A1_状態_A1有効_A2有効_シナリオ_insert1_insert2_insert3_exception3() {
        System.out.println("遷移：A1A2A1");
        System.out.println("状態：A1有効, A2有効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> insert 3 -> exception 3");

        // insert 1
        dao.insert();

        // insert 2
        insertWithTransaction();

        // insert 3
        dao.insert();

        // exception 3
        throw new RuntimeException();
    }

    @Transactional
    public void 遷移_A1A2A1_状態_A1有効_A2無効_シナリオ_insert1_insert2_insert3_exception3() {
        System.out.println("遷移：A1A2A1");
        System.out.println("状態：A1有効, A2無効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> insert 3 -> exception 3");

        // insert 1
        dao.insert();

        // insert 2
        insertWithNoTransaction();

        // insert 3
        dao.insert();

        // exception 3
        throw new RuntimeException();
    }

    public void 遷移_A1A2A1_状態_A1無効_A2有効_シナリオ_insert1_insert2_insert3_exception3() {
        System.out.println("遷移：A1A2A1");
        System.out.println("状態：A1無効, A2有効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> insert 3 -> exception 3");

        // insert 1
        dao.insert();

        // insert 2
        insertWithTransaction();

        // insert 3
        dao.insert();

        // exception 3
        throw new RuntimeException();
    }

    public void 遷移_A1A2A1_状態_A1無効_A2無効_シナリオ_insert1_insert2_insert3_exception3() {
        System.out.println("遷移：A1A2A1");
        System.out.println("状態：A1無効, A2無効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> insert 3 -> exception 3");

        // insert 1
        dao.insert();

        // insert 2
        insertWithNoTransaction();

        // insert 3
        dao.insert();

        // exception 3
        throw new RuntimeException();
    }

    @Transactional
    public void 遷移_ABA_状態_A有効_B有効_シナリオ_insert1_insert2_insert3_exception3() {
        System.out.println("遷移：ABA");
        System.out.println("状態：A有効, B有効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> insert 3 -> exception 3");

        // insert 1
        dao.insert();

        // insert 2
        serviceB.insertWithTransaction();

        // insert 3
        dao.insert();

        // exception 3
        throw new RuntimeException();
    }

    @Transactional
    public void 遷移_ABA_状態_A有効_B無効_シナリオ_insert1_insert2_insert3_exception3() {
        System.out.println("遷移：ABA");
        System.out.println("状態：A有効, B無効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> insert 3 -> exception 3");

        // insert 1
        dao.insert();

        // insert 2
        serviceB.insertWithNoTransaction();

        // insert 3
        dao.insert();

        // exception 3
        throw new RuntimeException();
    }

    public void 遷移_ABA_状態_A無効_B有効_シナリオ_insert1_insert2_insert3_exception3() {
        System.out.println("遷移：ABA");
        System.out.println("状態：A無効, B有効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> insert 3 -> exception 3");

        // insert 1
        dao.insert();

        // insert 2
        serviceB.insertWithTransaction();

        // insert 3
        dao.insert();

        // exception 3
        throw new RuntimeException();
    }

    public void 遷移_ABA_状態_A無効_B無効_シナリオ_insert1_insert2_insert3_exception3() {
        System.out.println("遷移：ABA");
        System.out.println("状態：A無効, B無効");
        System.out.println("シナリオ：insert 1 -> insert 2 -> insert 3 -> exception 3");

        // insert 1
        dao.insert();

        // insert 2
        serviceB.insertWithNoTransaction();

        // insert 3
        dao.insert();

        // exception 3
        throw new RuntimeException();
    }

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
