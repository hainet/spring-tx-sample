package com.hainet.spring.tx.sample.domain.service;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionTest {

    @Autowired
    private JdbcTemplate jdbc;

    @Autowired
    private ServiceA serviceA;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @After
    public void count() {
        System.out.println(jdbc.queryForList("SELECT * FROM model"));

        int count = jdbc.queryForList("SELECT * FROM model").size();
        System.out.println("挿入件数：" + count);
        jdbc.update("DELETE FROM model");
    }

    @Test
    public void 遷移_A_状態_A有効_シナリオ_insert1_exception1() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A_状態_A有効_シナリオ_insert1_exception1();
    }

    @Test
    public void 遷移_A_状態_A無効_シナリオ_insert1_exception1() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A_状態_A無効_シナリオ_insert1_exception1();
    }

    @Test
    public void 遷移_A1A2_状態_A1有効_A2有効_シナリオ_insert1_insert2_exception2() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A1A2_状態_A1有効_A2有効_シナリオ_insert1_insert2_exception2();
    }

    @Test
    public void 遷移_A1A2_状態_A1有効_A2無効_シナリオ_insert1_insert2_exception2() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A1A2_状態_A1有効_A2無効_シナリオ_insert1_insert2_exception2();
    }

    @Test
    public void 遷移_A1A2_状態_A1無効_A2有効_シナリオ_insert1_insert2_exception2() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A1A2_状態_A1無効_A2有効_シナリオ_insert1_insert2_exception2();
    }

    @Test
    public void 遷移_A1A2_状態_A1無効_A2無効_シナリオ_insert1_insert2_exception2() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A1A2_状態_A1無効_A2無効_シナリオ_insert1_insert2_exception2();
    }

    @Test
    public void 遷移_AB_状態_A有効_B有効_シナリオ_insert1_insert2_exception2() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_AB_状態_A有効_B有効_シナリオ_insert1_insert2_exception2();
    }

    @Test
    public void 遷移_AB_状態_A有効_B無効_シナリオ_insert1_insert2_exception2() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_AB_状態_A有効_B無効_シナリオ_insert1_insert2_exception2();
    }

    @Test
    public void 遷移_AB_状態_A無効_B有効_シナリオ_insert1_insert2_exception2() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_AB_状態_A無効_B有効_シナリオ_insert1_insert2_exception2();
    }

    @Test
    public void 遷移_AB_状態_A無効_B無効_シナリオ_insert1_insert2_exception2() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_AB_状態_A無効_B無効_シナリオ_insert1_insert2_exception2();
    }

    @Test
    public void 遷移_A1A2A1_状態_A1有効_A2有効_シナリオ_insert1_insert2_insert3_exception3() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A1A2A1_状態_A1有効_A2有効_シナリオ_insert1_insert2_insert3_exception3();
    }

    @Test
    public void 遷移_A1A2A1_状態_A1有効_A2無効_シナリオ_insert1_insert2_insert3_exception3() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A1A2A1_状態_A1有効_A2無効_シナリオ_insert1_insert2_insert3_exception3();
    }

    @Test
    public void 遷移_A1A2A1_状態_A1無効_A2有効_シナリオ_insert1_insert2_insert3_exception3() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A1A2A1_状態_A1無効_A2有効_シナリオ_insert1_insert2_insert3_exception3();
    }

    @Test
    public void 遷移_A1A2A1_状態_A1無効_A2無効_シナリオ_insert1_insert2_insert3_exception3() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_A1A2A1_状態_A1無効_A2無効_シナリオ_insert1_insert2_insert3_exception3();
    }

    @Test
    public void 遷移_ABA_状態_A有効_B有効_シナリオ_insert1_insert2_insert3_exception3() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_ABA_状態_A有効_B有効_シナリオ_insert1_insert2_insert3_exception3();
    }

    @Test
    public void 遷移_ABA_状態_A有効_B無効_シナリオ_insert1_insert2_insert3_exception3() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_ABA_状態_A有効_B無効_シナリオ_insert1_insert2_insert3_exception3();
    }

    @Test
    public void 遷移_ABA_状態_A無効_B有効_シナリオ_insert1_insert2_insert3_exception3() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_ABA_状態_A無効_B有効_シナリオ_insert1_insert2_insert3_exception3();
    }

    @Test
    public void 遷移_ABA_状態_A無効_B無効_シナリオ_insert1_insert2_insert3_exception3() {
        thrown.expect(RuntimeException.class);
        serviceA.遷移_ABA_状態_A無効_B無効_シナリオ_insert1_insert2_insert3_exception3();
    }
}
