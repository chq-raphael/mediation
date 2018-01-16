package com.xcjaas.mediation.mapper;


import com.xcjaas.mediation.entity.User;
import com.xcjaas.mediation.entity.encapsulation.State_0;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
@Mapper
@Repository
public interface UserMapper {
    void addUser(User user);

    List<User> selectThreeMediators();

    void insertTwoMediators(State_0 state_0);
}
