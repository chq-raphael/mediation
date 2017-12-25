package com.xcjaas.mediation.service.impl;

import com.xcjaas.mediation.entity.Conversation;
import com.xcjaas.mediation.entity.Dialog;
import com.xcjaas.mediation.entity.Node;
import com.xcjaas.mediation.mapper.NodeMapper;
import com.xcjaas.mediation.service.DialogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wallaw on 2017/12/21.
 */
@Service
public class DialogServiceImpl implements DialogService {

    @Autowired
    private NodeMapper nodeMapper;

    @Override
    public Dialog dialog() {

        Dialog dialog = new Dialog();
        dialog.setCompleteServerText("您好，我是小崇机器人，请您点击选择想要咨询的问题，您也可以直接输入语音或者文字向我提问");
        Conversation conversation = new Conversation();
        conversation.setCategoryAlias("hyjf");
        conversation.setClientId("6ce4f91e-a3c7-4805-9b50-91229918ec65");
        conversation.setCreateDate(new Date());
        conversation.setId("5a38ccbab98a54111fa4a675");
        dialog.setConversation(conversation);

        List<Node> nodes = nodeMapper.listByParent("hyjf");

        dialog.setNodes(nodes);
        List<String> texts = new ArrayList<>();
        texts.add("您好，我是小崇机器人，请您点击选择想要咨询的问题，您也可以直接输入语音或者文字向我提问");
        dialog.setText(texts);
        return dialog;
    }
}
