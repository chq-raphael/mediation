package com.xcjaas.mediation.ws;

import com.alibaba.fastjson.JSON;
import com.xcjaas.mediation.entity.Dialog;
import com.xcjaas.mediation.service.DialogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.server.standard.SpringConfigurator;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by wallaw on 2017/12/19.
 */
//@ServerEndpoint(value="/ws")
//@Component
public class JaasWebSocket {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static int onlineCount = 0;
    private static CopyOnWriteArraySet<JaasWebSocket> webSocketSet = new CopyOnWriteArraySet<>();

    private Session session;

    @Autowired
    private  DialogService dialogService = (DialogService)ContextLoader.getCurrentWebApplicationContext().getBean("dialogService");



    @OnOpen
    public void onOpen(Session session) throws IOException {
        this.session = session;
        webSocketSet.add(this);
        incrOnlineCount();
        for (JaasWebSocket item : webSocketSet) {
            if (!item.equals(this)) { //send to others only.
                Dialog dialog = dialogService.dialog();
                String intarrJSON = JSON.toJSONString(dialog);
                item.sendMessage(intarrJSON);
            }
        }
        logger.info("new connection...current online count: {}", getOnlineCount());
    }

    @OnClose
    public void onClose() throws IOException {
        webSocketSet.remove(this);
        decOnlineCount();
        for (JaasWebSocket item : webSocketSet) {
            item.sendMessage("someone just closed a connection.");
        }
        logger.info("one connection closed...current online count: {}", getOnlineCount());
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {

        System.out.println(message);
        if (message.equals("ping")){
            for (JaasWebSocket item: webSocketSet){
                item.sendMessage("pong");
            }
        }else {
            Dialog dialog = dialogService.dialog();
            String intarrJSON = JSON.toJSONString(dialog);

            logger.info("message received: {}", intarrJSON);
            // broadcast received message
            for (JaasWebSocket item : webSocketSet) {
                item.sendMessage(intarrJSON);
            }
        }
    }

    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    public static synchronized int getOnlineCount() {
        return JaasWebSocket.onlineCount;
    }

    public static synchronized void incrOnlineCount() {
        JaasWebSocket.onlineCount++;
    }

    public static synchronized void decOnlineCount() {
        JaasWebSocket.onlineCount--;
    }
}
