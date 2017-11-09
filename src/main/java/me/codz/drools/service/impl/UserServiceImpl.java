package me.codz.drools.service.impl;

import me.codz.drools.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>Created with IDEA
 * <p>Author: dukang.liu
 * <p>Date: 2017/10/26
 * <p>Time: 18:28
 * <p>Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void hi() {
        System.out.println("hi UserService console");
    }
}
