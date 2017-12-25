package com.xcjaas.mediation.ws;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xcjaas.mediation.mapper.NodeMapper;
import com.xcjaas.mediation.mapper.WsMapper;
import com.xcjaas.mediation.ws.model.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ServerHandshake;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example demonstrates how to create a websocket connection to a server. Only the most important callbacks are overloaded.
 */
public class StomClient extends WebSocketClient {


    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private WsMapper mapper;
    private static String covid;

    public StomClient(URI serverUri, Draft draft) {
        super(serverUri, draft);
    }

    public StomClient(URI serverURI) {
        super(serverURI);

        String resource = "myconfig.xml";
        InputStream inputStream = null;

        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
        try {
            mapper = session.getMapper(WsMapper.class);
        } finally {
//            session.close();
        }
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("opened connection");
        RequestJsonRootBean requestJsonRootBean = new RequestJsonRootBean();
        Auth auth = new Auth();
        auth.setAuthCode("061hfGKT0jbmEX1zPOLT0XXCKT0hfGKP");
        auth.setUserId("5a24e50cb98a544f10147b91");
        requestJsonRootBean.setAuth(auth);
        requestJsonRootBean.setBoard("hyjf");
//        requestJsonRootBean.setConversationId("5a3c5874b98a54111fa4a822");
        requestJsonRootBean.setMessageRequestType("INITIALIZE");
        requestJsonRootBean.setParentAlias("lhjf");
        requestJsonRootBean.setText("我想了解离婚纠纷相关问题。");
        List<Param> params = new ArrayList<>();
        requestJsonRootBean.setParam(new Param());
        requestJsonRootBean.setSource("WECHAT");
        String str = JSON.toJSONString(requestJsonRootBean);
//        String str1 = "{\"messageRequestType\":\"CLICK\",\"parentAlias\":\"lhjf\",\"text\":\"我想了解离婚纠纷相关问题。\",\"conversationId\":\"5a3c935bb98a54111fa4a901\",\"board\":\"hyjf\",\"param\":{},\"source\":\"WECHAT\",\"auth\":{\"authCode\":\"081Zaye51tqVbM1pN6d511Dce51ZayeM\",\"userId\":\"5a24e50cb98a544f10147b91\"}}";
        System.out.println(str);
        this.send(str);
    }

    @Override
    public void onMessage(String message) {
        System.out.println("received message: " + message);
        if (message.equals("pong")) {
            System.out.println("received: pong");
        } else {
            JsonRootBean dialog = JSON.parseObject(message, new TypeReference<JsonRootBean>() {
            });
            System.out.println("received: " + dialog);
            mapper.insertRoot(dialog);
            if (dialog.getConversation() != null) {
                covid=dialog.getConversation().getId();
                dialog.getConversation().setRootId(dialog.getId());
                mapper.insertConversation(dialog.getConversation());
            }
            for (Nodes entity : dialog.getNodes()) {
                entity.setRootId(dialog.getId());
                mapper.insertNode(entity);
            }
            session.commit();

            senddd(dialog.getNodes());
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String str = "ping";
        this.send(str);
    }

    public void senddd(List<Nodes> list) {
        for (Nodes nodes : list) {
            RequestJsonRootBean requestJsonRootBean = new RequestJsonRootBean();
            Auth auth = new Auth();
            auth.setAuthCode("061hfGKT0jbmEX1zPOLT0XXCKT0hfGKP");
            auth.setUserId("5a24e50cb98a544f10147b91");
            requestJsonRootBean.setAuth(auth);
            requestJsonRootBean.setBoard("hyjf");
            requestJsonRootBean.setConversationId(covid);
            requestJsonRootBean.setMessageRequestType("CLICK");
            requestJsonRootBean.setParentAlias(nodes.getAlias());
            requestJsonRootBean.setText(nodes.getChooseSentence());
            List<Param> params = new ArrayList<>();
            requestJsonRootBean.setParam(new Param());
            requestJsonRootBean.setSource("WECHAT");
            String str = JSON.toJSONString(requestJsonRootBean);
            System.out.println(str);
            this.send(str);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            break;
        }
    }

    public void onFragment(Framedata fragment) {
        System.out.println("received fragment: " + new String(fragment.getPayloadData().array()));
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        // The codecodes are documented in class org.java_websocket.framing.CloseFrame
        System.out.println("Connection closed by " + (remote ? "remote peer" : "us"));
    }

    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
        // if the error is fatal then onClose will be called additionally
    }


    public static void main(String[] args) throws URISyntaxException {


        StomClient c1 = new StomClient(new URI("ws://legal.prod.hrx.ai:2048/ws"));
        c1.connect();

    }

}
