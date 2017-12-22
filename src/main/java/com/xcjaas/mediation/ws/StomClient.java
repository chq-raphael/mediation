package com.xcjaas.mediation.ws;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xcjaas.mediation.entity.Dialog;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;

/** This example demonstrates how to create a websocket connection to a server. Only the most important callbacks are overloaded. */
public class StomClient extends WebSocketClient {

    public StomClient( URI serverUri , Draft draft ) {
        super( serverUri, draft );
    }

    public StomClient( URI serverURI ) {
        super( serverURI );
    }

    @Override
    public void onOpen( ServerHandshake handshakedata ) {
        System.out.println( "opened connection" );
        String str = "{\"messageRequestType\":\"INITIALIZE\",\"board\":\"hyjf\",\"param\":{},\"source\":\"WECHAT\",\"auth\":{\"authCode\":\"081Zaye51tqVbM1pN6d511Dce51ZayeM\",\"userId\":\"5a24e50cb98a544f10147b91\"}}";
        this.send(str);
    }

    @Override
    public void onMessage( String message ) {
        System.out.println("received message: " + message);
        if (message.equals("pong")) {
            System.out.println("received: pong");
        }else {
            Dialog dialog = JSON.parseObject(message, new TypeReference<Dialog>() {});
            System.out.println("received: " + dialog);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String str = "ping";
        this.send(str);
    }

    public void onFragment( Framedata fragment ) {
        System.out.println( "received fragment: " + new String( fragment.getPayloadData().array() ) );
    }

    @Override
    public void onClose( int code, String reason, boolean remote ) {
        // The codecodes are documented in class org.java_websocket.framing.CloseFrame
        System.out.println( "Connection closed by " + ( remote ? "remote peer" : "us" ) );
    }

    @Override
    public void onError( Exception ex ) {
        ex.printStackTrace();
        // if the error is fatal then onClose will be called additionally
    }

    public static void main( String[] args ) throws URISyntaxException {

        StomClient c1 = new StomClient(new URI("ws://legal.prod.hrx.ai:2048/ws"));
        c1.connect();

    }

}
