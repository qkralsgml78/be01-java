package day13_IO.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException{

		//Scanner클래스 추가 되기 전에는 이렇게 써야 했음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("charater input : ");
		int str = Integer.parseInt(br.readLine()); // int형태로 br을 바꿔서 읽어오고 str에 저장
		int str1 = Integer.parseInt(br.readLine()); 
		
		
//		InputStream is = System.in; //표준입력
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
		
		
//		String str = br.readLine(); //예외발생
//		String str1 = br.readLine(); //예외발생
//		
//		int su = Integer.parseInt(str);
//		int su1 = Integer.parseInt(str1);
//		
		System.out.println(str+str1);
//		System.out.println(su+su1);
	}
}

