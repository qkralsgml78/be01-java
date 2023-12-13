package day16_network.tcp03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest { // 2개 Socket필요
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		
		System.out.println("Server Start~~~");
		try {
			ss= new ServerSocket(9000); //0~1204는 포트넘버는 예약이 되어 있음
			s = ss.accept(); //client Socket, 응답 대기
			//서버 시작하면 여기서 기다림, 응답 대기 클라이언트가 accept을 통해 들어옴 그리고 밑에 코드 실행
			
			//  I/O 객체를 통해 server에게 말을 걸음
			InputStream is = s.getInputStream(); //read
			OutputStream os = s.getOutputStream(); //write
			
			byte[] arr = new byte[100];
			is.read(arr);//클라이언트의 message를 읽어드리고
			System.out.println(new String(arr));//출력
			
			String message= "안녕. Client";// 클라이언트의 문자를 읽고 출력하면
			os.write(message.getBytes()); // 이 문자를 출력
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				ss.close();
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
