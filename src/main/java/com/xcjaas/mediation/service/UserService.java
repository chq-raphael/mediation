package com.xcjaas.mediation.service;


import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.User;
import com.xcjaas.mediation.entity.encapsulation.Dsr;
import com.xcjaas.mediation.entity.encapsulation.State_Zero;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public interface UserService {
    void addUser(User user);
    List<User> selectThreeMediators();
    void insertTwoMediators(List<State_Zero> state_Zeros);
    void insertCase(Case cas);
    User selectOne(int userId);
    void insertDsr(List<Dsr> dsrs);
}
