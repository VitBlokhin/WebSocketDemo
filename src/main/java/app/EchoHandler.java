package app;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class EchoHandler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        //super.handleTextMessage(session, message);
        //session.sendMessage(new TextMessage( "User" +  session.getId() + message.getPayload() ));
        session.sendMessage(new TextMessage( message.getPayload() ));
    }
} // class EchoHandler
