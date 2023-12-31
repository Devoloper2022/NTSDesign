package com.example.ntsdesigntest.Config;


import com.example.ntsdesigntest.Controller.WebSocketController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
@EnableScheduling
public class WebSocketConfig implements WebSocketConfigurer {


        @Override
        public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
            registry.addHandler(webSocketHandler(), "/websocket");
        }

        @Bean
        public WebSocketHandler webSocketHandler() {
            return new WebSocketController();
        }

}