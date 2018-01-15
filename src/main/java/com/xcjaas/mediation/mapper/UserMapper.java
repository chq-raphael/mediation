package com.xcjaas.mediation.mapper;


import com.xcjaas.mediation.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/1/10.
 */
@Mapper
@Repository
public interface UserMapper {
    void addUser(User user);
}
