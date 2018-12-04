package or.kosta.mvc.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
//Input Text Message에 ECHO:를 붙여주는 매우 단순한 TextMessageHandler를 구성
public class MySocketHandler extends TextWebSocketHandler{
    /**
     * 서버에 연결한 사용자들을 저장하는 리스트 입니다.
     */
    private List<WebSocketSession> connectedUsers;
    public MySocketHandler() {
        connectedUsers = new ArrayList<WebSocketSession>();
    }
    // 클라이언트 연결 후 실행되는 메서드 
    // websocket.onopen에 의해서 호출 될 때 감지됨
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        connectedUsers.add(session);
        System.out.println(session.getId() + "님이 접속했습니다.");
        System.out.println("연결 IP : " + session.getRemoteAddress().getHostName());
        System.out.println("접속자수1  :"+connectedUsers.size());
        System.out.println("-----------------");
    }
    // 클라이언트 메세지 받아서 접속된 소켓에 출력는 메서드.
  @Override
  public void handleMessage(WebSocketSession session,
               WebSocketMessage<?> message) throws Exception {
        super.handleMessage(session, message);
        //sendMessage(message.toString());
        System.out.println("receive message1:"+message.toString());
        System.out.println("receive message2:"+message.getPayload());
        for(WebSocketSession sess : connectedUsers){
            sess.sendMessage(new TextMessage(message.getPayload().toString()));
            System.out.println("Test");
        }
        System.out.println("접속자수2  :"+connectedUsers.size());
  }
    /**
     * 클라이언트가 서버와 연결을 끊었을때 실행되는 메소드
     * 
     * @param WebSocketSession
     *            연결을 끊은 클라이언트
     * @param CloseStatus
     *            연결 상태(확인 필요함)
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        connectedUsers.remove(session);
        for (WebSocketSession webSocketSession : connectedUsers) {
            /*
             * 자신이 보낸 메시지를 받지 않는다.
             */
            if (!session.getId().equals(webSocketSession.getId())) {
                webSocketSession.sendMessage(new TextMessage(session.getRemoteAddress().getHostName() + "퇴장했습니다."));
            }
        }
        System.out.println("접속자수3  :"+connectedUsers.size());
 
    }
}
