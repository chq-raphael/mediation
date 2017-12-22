package com.xcjaas.mediation.ws;

import com.alibaba.fastjson.JSON;
import com.xcjaas.mediation.entity.Dialog;
import com.xcjaas.mediation.service.DialogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Created by wallaw on 2017/12/21.
 */
@Component
public class WsHandler extends TextWebSocketHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(WsHandler.class);

    @Autowired
    private DialogService dialogService;

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        super.afterConnectionClosed(session, status);
        LOGGER.info("close....");
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        super.afterConnectionEstablished(session);
        LOGGER.info("建立新的会话");
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        LOGGER.info(message.getPayload());
        if (message.getPayload().equals("ping")) {
            session.sendMessage(new TextMessage("pong"));
        } else {
            Dialog dialog = dialogService.dialog();
            TextMessage msg = new TextMessage(JSON.toJSONString(dialog));
            session.sendMessage(msg);
        }
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        super.handleMessage(session, message);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        super.handleTransportError(session, exception);
    }

}
