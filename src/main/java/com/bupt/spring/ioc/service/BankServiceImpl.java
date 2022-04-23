package com.bupt.spring.ioc.service;

import com.bupt.spring.ioc.tx.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: 金培源
 * @Date: 2022/4/22 20:07
 * @Version: 1.0
 * @Description:
 */
@Service
@Transactional
public class BankServiceImpl implements Bank {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private String sql = "update user set money = money - ? where id = ?";
    @Override
    public void decMoney(int id, int money) {
        jdbcTemplate.update(sql, new Object[]{money, id});
    }

    @Override
    public void incMoney(int id, int money) {
        jdbcTemplate.update(sql, new Object[]{-money, id});
    }

    @Override
    public void bank() {
        decMoney(1,1000);
        int i = 10 / 0;
        incMoney(2,1000);
    }
}
