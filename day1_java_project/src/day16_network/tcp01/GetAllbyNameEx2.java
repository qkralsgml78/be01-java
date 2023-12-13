package day16_network.tcp01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;


//원하는 주소를 아무거나 입력해서 정보와 여러가지를 출력하는 방법
public class GetAllbyNameEx2 {
	public static void main(String[] args) throws UnknownHostException{
		
		InetAddress address  = InetAddress.getLocalHost();
		System.out.println("로컬 호스트 이름: "+ address.getHostName());
		System.out.println("로컬 호스트 IP주소: "+address.getHostAddress());
		System.out.println("====================================");
		
		address = InetAddress.getByName("www.en-core.com");
		System.out.println("로컬 호스트 이름: "+ address.getHostName());
		System.out.println("로컬 호스트 IP주소: "+address.getHostAddress());
		System.out.println("====================================");
		
		byte[] addr = new byte[4];
		addr[0] = (byte) 192;
		addr[0] = (byte) 168;
		addr[0] = (byte) 0;
		addr[0] = (byte) 48;
		addr[0] = (byte) 93;
		
		address = InetAddress.getByAddress(addr);
		System.out.println("로컬 호스트 이름: "+ address.getHostName());
		System.out.println("로컬 호스트 IP주소: "+address.getCanonicalHostName());
		System.out.println("로컬 호스트 IP주소: "+address.getHostAddress());
		System.out.println("====================================");

		
		InetAddress[] arr = InetAddress.getAllByName("www.google.com");
//		InetAddress[] arr = InetAddress.getAllByName("www.name.com");
		
		for (InetAddress item : arr) {
			System.out.println("로컬 호스트 이름: "+ item.getHostName());
			System.out.println("로컬 호스트 IP주소: "+item.getHostAddress());
		}
		
		
	}
}
