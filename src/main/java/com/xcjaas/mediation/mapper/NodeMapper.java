package com.xcjaas.mediation.mapper;

import com.xcjaas.mediation.entity.Node;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wallaw on 2017/12/21.
 */
@Repository
public interface NodeMapper {
    void insert(Node node);
    List<Node> listByParent(@Param("parent") String parent);
}
