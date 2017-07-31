package edu.zju.sprint.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

public class MacroHandler extends AbstractWebSocketHandler
{

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception
	{
		Thread.sleep(1000);
		session.sendMessage(new TextMessage("Polo"));
	}

}
