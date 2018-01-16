package com.xcjaas.mediation.service.impl;


import com.xcjaas.mediation.entity.User;
import com.xcjaas.mediation.entity.encapsulation.State_Zero;
import com.xcjaas.mediation.mapper.UserMapper;
import com.xcjaas.mediation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public List<User> selectThreeMediators() {
        return userMapper.selectThreeMediators();
    }

    @Override
    public void insertTwoMediators(List<State_Zero> state_Zeros) {
        userMapper.insertTwoMediators(state_Zeros);
    }
}
