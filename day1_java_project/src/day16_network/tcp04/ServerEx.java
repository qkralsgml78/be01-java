package day16_network.tcp04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket server = null; // socket 1번째
		Socket client = null; //socket 2번째 생성
		
		System.out.println("연결됨 나는 서버야!");
		
		try {
			server = new ServerSocket(9999);//클라이언트에서 포트 번호가 안맞거나, 주소가 잘못 되어있거나, 오타가 있으면 오류가 발생
			client = server.accept(); //클라이언트 응답대기, 클라이언트 소켓 생성
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));// 네트워크를 통해서 데이터 읽어옴
			//키보드로부터 입력 스트림
			stin = new BufferedReader(new InputStreamReader(System.in));
			
			//클라이언트로의 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = br.readLine();//클라이언트에서 한행의 문자열 읽음
				//클라이언트가  "exit"를 버내면 연결 종료
				if(inputMessage.equalsIgnoreCase("exit")) break;
				
				System.out.println(inputMessage); //클라이언트가 보낸 메세지 화면 출력
				
				String outputMessage = stin.readLine();//키보드에서 한 행의 문자열 읽음
				//키보드에서 읽은 문자열 전송
				bw.write(client.getInetAddress()+"서버> "+outputMessage+"\n");
				//client 소켓을 이용해 주소(getInetAddress)와 방금 읽어드린 메세지(outputMessage)를 써주는 것
				bw.flush();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				client.close();
//				server.close();
			} catch (Exception e2) {
				System.out.println("클라이언트와 채팅 중 오류 발생....!");
			}
		}
	}

}
