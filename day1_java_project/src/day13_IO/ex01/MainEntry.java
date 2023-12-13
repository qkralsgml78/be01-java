package day13_IO.ex01;

import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in; //표준입력 그릇
		
		System.out.println("단일 문자 입력 : ");
		
//		int num = is.read(); //예외발생 
		
		try {
			System.out.println("단일 문자 입력 : ");
//			int num = is.read(); //'0' ~'9' : 48~57(ASCII code)
			//문자열을 여러개 넣어도 read()는 하나의 문자열 밖에 인식을 못함
			//출력은 아스키코드값으로 출력
			
			int num = is.read()-48; //숫자를 출력을 해주려면 숫자에서 ASCII코드 값을 빼주면 됌(a값 빼줌)
			
			
			is.read();  is.read(); //화이트 스페이스를 잡기위해 이 함수를 넣음 근데 char은 2byte여서 read함수를 2개 넣음
			
			int num2 = is.read()-48; //숫자를 출력을 해주려면 숫자에서 ASCII코드를 빼주면 됌
			
			System.out.println(num+num2);
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
