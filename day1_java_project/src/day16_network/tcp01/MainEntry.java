package day16_network.tcp01;

import java.net.InetAddress;
import java.net.UnknownHostException;


//주소를 직접 저장해서 찍어내는 방법
public class MainEntry {
	public static void main(String[] args){
//		String host = "127.0.0.1";
		String host = "192.168.0.14";//자신의 IPv4 주소를 넣었을 때느 다르게 나옴
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			
			for (InetAddress item: address) {
				System.out.println(item);
				System.out.println(item.getCanonicalHostName());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
