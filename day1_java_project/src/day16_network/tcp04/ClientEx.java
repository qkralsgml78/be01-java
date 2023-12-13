package day16_network.tcp04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null; //읽을 그릇
		BufferedWriter bw = null;//쓸 그릇
		Socket client = null; //socket 1번째 생성
		
		try {
			client = new Socket("127.0.0.1", 9999);
			br =new BufferedReader(new InputStreamReader(client.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			
			while(true) {
				System.out.println("message input :");
				outputMessage = stin.readLine();
				
				if(outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				}
				bw.write(client.getInetAddress()+" 클라이언트 >"+outputMessage+"\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				client.close();
			} catch (Exception e2) {
				System.out.println("server와 채팅 중 오류 발생...");
			}
		}
	}

}
