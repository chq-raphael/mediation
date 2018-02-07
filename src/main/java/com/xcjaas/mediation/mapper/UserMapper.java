package com.xcjaas.mediation.mapper;


import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.User;
import com.xcjaas.mediation.entity.encapsulation.CaseJudgedDetail;
import com.xcjaas.mediation.entity.encapsulation.Dsr;
import com.xcjaas.mediation.entity.encapsulation.State_Zero;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
@Mapper
@Repository
public interface UserMapper {
    //添加用户
    void addUser(User user);

    //返回客户端备选的调解员
    List<User> selectThreeMediators();

    //临时存储客户筛选的调解员
    void insertTwoMediators(List<State_Zero> state_Zeros);

    //创建调解案件
    void insertCase(Case cas);

    //根据userId查找一个客户
    User selectOne(int userId);

    //用户填写其他当事人信息并且储存
    void insertDsr(List<Dsr> dsrs);

}
