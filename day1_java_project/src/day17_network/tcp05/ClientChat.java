package day17_network.tcp05;
import java.io.*;
import java.net.*;

public class ClientChat {
	public static void main(String[] args) throws IOException {  //예외처리
		int port = 8000;
		String ip, str;
		
		PrintStream ps = new PrintStream(System.out);
		BufferedReader br
		      = new BufferedReader(new InputStreamReader(System.in)); //키보드로부터 입력받음(System.in)...
		
		ps.print("접속할 서버 ip ==> "); 		ip = br.readLine(); //127.0.0.1
		ps.print("전송할 메세지  ==> "); 		str = br.readLine(); //String
		
		byte[] buffer = str.getBytes("euc-kr"); //한글이 깨지지 않게 buffer에 넣어서 읽어드림
		String message = new String(buffer, "euc-kr");
		
		Socket  client = new Socket(ip, port);  // server ip /port number socket create /Socket 1개 
		OutputStream os = client.getOutputStream(); //네트워크를  ip 통해서 쓰기... //Socket을 통해서 output한 것은 네트워크를 통해서 쓰겠다
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os)); //캐리ㄱ터 단위로 쓰겠다
		bw.write(message, 0, message.length()); //읽어드린 문자를 0부터 시작해서 문자열을 길이 만큼 write해
		//bw.write(str, 0, message.length()); 
		bw.flush();  //buffer가 다 차지 않았어도 buffer를 비워줘
		
		bw.close();		client.close();
		ps.println(ip + " 에서 메세지 전송 성공~~");
		ps.close();
	}
}
