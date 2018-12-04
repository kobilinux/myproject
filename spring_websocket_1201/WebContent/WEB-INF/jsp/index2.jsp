<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>	    
<!--   -->
<div id="article">
	<div id="header2">
		<h1>  uri : WebSocket을 활용한 채팅 :</h1>
		<p id="time">2018. 11. 27.</p>
	</div>
	<div id="content">

        <script type="text/javascript">
           //ws://localhost/spring_tx_1130/
            var wsUri = "ws://192.168.0.13/spring_websocket_1201/websocket/echo";
            function init() {
                output = document.getElementById("output");
            }
            function send_message() {
                websocket = new WebSocket(wsUri);
                websocket.onopen = function(evt) {
                	console.log("onopen : "+evt);
                    onOpen(evt)
                };
                websocket.onmessage = function(evt) {
                	console.log("onmessage : "+evt);
                    onMessage(evt)
                };
                websocket.onerror = function(evt) {
                    onError(evt)
                };
            }
            function onOpen(evt) {
                writeToScreen("Connected to Endpoint!");
                doSend(textID.value);
            }
            function onMessage(evt) {
                writeToScreen("Message Received: " + evt.data);
            }
            function onError(evt) {
                writeToScreen('ERROR: ' + evt.data);
            }
            function doSend(message) {
                //writeToScreen("Message Sent: " + message);
                websocket.send(message);
                //websocket.close();
            }
            function writeToScreen(message) {
                var pre = document.createElement("p");
                pre.style.wordWrap = "break-word";
                pre.innerHTML = message;
                
                output.appendChild(pre);
                output.scrollTop=output.scrollHight;
            }
            window.addEventListener("load", init, false);
        </script>
        <h1 style="text-align: center;">MyWebSocket!</h1>
        <br>
        <div style="text-align: center;">
            <form action="">
                <input onclick="send_message()" value="Send" type="button">
                <input id="textID" name="message" value="" type="text"><br>
            </form>
        </div>
        <div id="output"></div>


	</div>
</div>