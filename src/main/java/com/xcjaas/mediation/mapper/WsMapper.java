package com.xcjaas.mediation.mapper;

import com.xcjaas.mediation.ws.model.Conversation;
import com.xcjaas.mediation.ws.model.JsonRootBean;
import com.xcjaas.mediation.ws.model.Nodes;
import org.springframework.stereotype.Repository;

/**
 * Created by wallaw on 2017/12/22.
 */
@Repository
public interface WsMapper {

    void insertRoot(JsonRootBean entity);
    void insertNode(Nodes entity);
    void insertConversation(Conversation entity);
}
