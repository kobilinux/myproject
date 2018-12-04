package or.kosta.mvc.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
//Input Text Message�� ECHO:�� �ٿ��ִ� �ſ� �ܼ��� TextMessageHandler�� ����
public class MySocketHandler extends TextWebSocketHandler{
    /**
     * ������ ������ ����ڵ��� �����ϴ� ����Ʈ �Դϴ�.
     */
    private List<WebSocketSession> connectedUsers;
    public MySocketHandler() {
        connectedUsers = new ArrayList<WebSocketSession>();
    }
    // Ŭ���̾�Ʈ ���� �� ����Ǵ� �޼��� 
    // websocket.onopen�� ���ؼ� ȣ�� �� �� ������
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        connectedUsers.add(session);
        System.out.println(session.getId() + "���� �����߽��ϴ�.");
        System.out.println("���� IP : " + session.getRemoteAddress().getHostName());
        System.out.println("�����ڼ�1  :"+connectedUsers.size());
        System.out.println("-----------------");
    }
    // Ŭ���̾�Ʈ �޼��� �޾Ƽ� ���ӵ� ���Ͽ� ��´� �޼���.
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
        System.out.println("�����ڼ�2  :"+connectedUsers.size());
  }
    /**
     * Ŭ���̾�Ʈ�� ������ ������ �������� ����Ǵ� �޼ҵ�
     * 
     * @param WebSocketSession
     *            ������ ���� Ŭ���̾�Ʈ
     * @param CloseStatus
     *            ���� ����(Ȯ�� �ʿ���)
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        connectedUsers.remove(session);
        for (WebSocketSession webSocketSession : connectedUsers) {
            /*
             * �ڽ��� ���� �޽����� ���� �ʴ´�.
             */
            if (!session.getId().equals(webSocketSession.getId())) {
                webSocketSession.sendMessage(new TextMessage(session.getRemoteAddress().getHostName() + "�����߽��ϴ�."));
            }
        }
        System.out.println("�����ڼ�3  :"+connectedUsers.size());
 
    }
}
