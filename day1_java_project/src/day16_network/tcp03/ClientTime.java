package day16_network.tcp03;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class ClientTime {
	public static void main(String[] args) { //클라이언트는 Server아이피랑 port를 둘 다 넣어야 됌
		//정확한 주소와 포트 번호가 일치해야 함
		String serverIP = "192.168.0.14";
		int port =7000;
		Date date = null;
		
		try {
			Socket s= new Socket(serverIP, port);// 읽어들일 객체 생성
			InputStream is = s.getInputStream();
			ObjectInputStream ois= new ObjectInputStream(is); //객체 생성
			
			System.out.println("Server측 날짜/시간 확인.. 여기는 클라이언트입니다.\n");
			date = (Date)ois.readObject();//날짜를 받을 데이터 그릇을 생성하고 서버측의 날짜를 저장
			System.out.println("현재 서버측 시간 : "+date.toString()
			+"입니다.");
//			System.out.println("현재 서버측 시간 : "+new String(date.toString())+"입니다.");
			
			ois.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
