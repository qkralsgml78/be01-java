package day16_network.tcp03;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTime {
	public static void main(String[] args) {
		int port = 7000; //포트번호를 직접 입력하거나 설정을 해놓거나
		
		try {
			System.out.println("Server Start!");
			ServerSocket ss = new ServerSocket(port); // socket 1개 (client)
			
			while(true) {
				Socket s= ss.accept();//Socket 2개(Server)
				
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);// 객체 타입의 아웃풋 스트림을 만듦
				
//				oos.writeObject(new Date());//날짜를 생성하면서 객체를 넘기고
				oos.writeObject(new Date()+"민희 컴");//날짜를 생성하면서 객체를 넘기고
				oos.flush(); // 버퍼 비우기(안에 있는 것 다 출력)
				os.close();//
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
