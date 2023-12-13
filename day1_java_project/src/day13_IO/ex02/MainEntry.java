package day13_IO.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	//2개의 정수 입력 받고, 1개의 연산자 입력 받아서 사칙연산 프로그램 작성하기(IO처리)
	public static void main(String[] args) throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("정수 2개를 입력하세요 : ");
		int n = Integer.parseInt(b.readLine());
		int n1 = Integer.parseInt(b.readLine());
		System.out.println("1개의 연산자를 입력하세요(+,-,*,/) : ");
		String s = b.readLine();
		int result = 0;
		int su = 0;
		
		
		if(s.equals("+")) {  result = n+n1;
		
		}else if(s.equals("*")) {  result = n*n1;
		
		}else if(s.equals("-")) {
			if(n>n1) {
				result = n-n1;
			}else result = n1-n;
		}else if(s.equals("/")) {
			if(n>n1) {
				result = n/n1;
			}else result = n1/n;
		}
		
		System.out.println("결과 값 : "+result);
		
	}

}
