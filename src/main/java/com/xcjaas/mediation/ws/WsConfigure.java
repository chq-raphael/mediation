package com.xcjaas.mediation.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by wallaw on 2017/12/21.
 */
@Configuration
@EnableWebSocket
public class WsConfigure implements WebSocketConfigurer {

    private static final Logger LOGGER = LoggerFactory.getLogger(WsConfigure.class);

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        LOGGER.info("==========================");
        registry.addHandler(myHandler(), "/ws").addInterceptors(new HandshakeInterceptor()).setAllowedOrigins("*");
    }

    @Bean
    public WsHandler myHandler() {
        LOGGER.info("==========================");
        return new WsHandler();
    }
}
