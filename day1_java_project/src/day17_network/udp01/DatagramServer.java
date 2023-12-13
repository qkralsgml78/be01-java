package day17_network.udp01;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServer { //UDP
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataOutputStream dos = null;
		
		int port = 8000;
		String str;
		File file = null;
		
		try {
			System.out.println("@@@ UDP file Server @@@");
			
			ds = new DatagramSocket(port);
			ds.receive(dp); //수신에 관한 
			
			

			while(true) {//클라이언트가 메세지를 보내면 여기로 옴
				dp = new DatagramPacket(new byte[65536], 65536);
				
				str = new String(dp.getData(), dp.getLength()).trim();//공백을 제거한 것을 str에 넣음
				
				if(str.equalsIgnoreCase("start")) {
					System.out.println("전송되고 있음");
					file = new File("test.txt");
					
					dos= new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));//내가 선언한 file에 기재를 계속 함
					
				}else if(str.equalsIgnoreCase("end")) { //end라는 메세지가 들어오면 끝내겠다
					System.out.println("end");
					break;
				}else {
					System.out.println(str); //화면에 출력하는 것 file에 잘 찍히고 있는지
					dos.write(dp.getData(), 0, dp.getLength()); //0~dp.length만큼 쓰세요
				}
				
			}//while end
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
