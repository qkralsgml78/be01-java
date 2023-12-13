package day17_network.udp01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		int port = 8000;
		String str = "";
		byte[] buffer = null;
		
		try {
			System.out.println("@@@ UDP file Client @@@");
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("전송 대상 (Server IP) : ");//127.0.0.1
			String ipAddress =br.readLine(); 
			
			System.out.println("전송 파일(파일명, 확장자) : ");
			String fileName = br.readLine();//파일명 지정해서 거기에 출력
			
			File file = new File(fileName);
			
			if(!file.exists()) {//파일명이 없으면 없다고 출력
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(-1);
				
			}
			str = "start";
			buffer = str.getBytes();
			ds = new DatagramSocket();
			
			InetAddress iaddress = InetAddress.getByName(ipAddress);//입력받은 주소(String)이것을 진짜 IP로 바꿔주는 역할 
			// 문자열 ip주소를 실제 ip주소로
			
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port); //데이터를 보내기 위한 데이터 조각을 buffer크기 만큼(65536), 그 크기(str의 start)의 길이만큼, 서버측 ip, 포트번호를 보냄
			//데이터그램포켓을 dp에 생성
			ds.send(dp); //start메세지를 보냄
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			
			buffer = new byte[65536];
			
			while(true) {
				int count = dis.read(buffer, 0, buffer.length); //낱개로 읽고 낱개로 써줌
				
				if(count == -1)break;
				
				dp = new DatagramPacket(buffer, count, iaddress, port); // iaddress, port에 보내라
				ds.send(dp);
				
				str = "end"; //end라는 게 들어오면 
				buffer= str.getBytes();
				
				dp = new DatagramPacket(buffer, buffer.length, iaddress, port);
				
				ds.send(dp);//end라는 글자를 보냄
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close(); br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
