package com.kucw.dao;

import com.kucw.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@ActiveProfiles("5566")
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoWithPredefinedDataTest {

    @Autowired
    private UserDao userDao;


    @Test
    public void find5566() throws Exception {
        userDao.print();
        Assert.assertEquals("5566不能亡", userDao.getUserById(5566).getName());
    }

}