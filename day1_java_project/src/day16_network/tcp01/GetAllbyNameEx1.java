package day16_network.tcp01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;


//원하는 주소를 아무거나 입력해서 정보와 여러가지를 출력하는 방법
public class GetAllbyNameEx1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strUrl = null;
		InetAddress[] address;
		
		System.out.println("site address: ");
		try {
			strUrl = br.readLine();//예외발생
			address = InetAddress.getAllByName(strUrl);//예외발생
			
			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
