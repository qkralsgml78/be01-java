package day16_network.tcp03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest { // 1개의 Socket 필요
	public static void main(String[] args) {
		Socket s =null;
		
		try {
			s = new Socket("192.168.0.14", 9000);//접속하고 싶은 server의 주소를 넣고 그 주소의 server가 실행되어 있으면 client로 접속이 가능
			
			// I/O 객체를 통해 server에게 말을 걸음
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			
			String str = "안녕하세요. Server님!";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];//100을하던 1000을 하던 상관 없음
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				s.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}

}
