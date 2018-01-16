package com.xcjaas.mediation.service;


import com.xcjaas.mediation.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public interface UserService {
    void addUser(User user);
    List<User> selectThreeMediators();
}
