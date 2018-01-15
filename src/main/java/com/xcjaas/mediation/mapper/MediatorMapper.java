package com.xcjaas.mediation.mapper;

import com.xcjaas.mediation.entity.Mediator;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 */
@Mapper
@Repository
public interface MediatorMapper {
    //管理员添加一个调解员
    void addMediator(Mediator mediator);
    //管理员删除一个调解员
    void deleteMediator(int id);
    //管理员修改一个调解员
    void modifyMediator(Mediator mediator);
    //管理员查找一个调解员
    Mediator selectMediatorById(int id);
    //分页查询调解员
    List<Mediator> selectMediatorsByPage(String search);
    //启用
    void enable(Mediator mediator);
    //停用
    void disable(Mediator mediator);
}
