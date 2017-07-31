package edu.zju.sprint.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;


@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer
{

	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry)
	{
		registry.addHandler(macroHandler(), "/macro");
		
	}

	@Bean
	public MacroHandler macroHandler()
	{
		return new MacroHandler();
	}
	
}
