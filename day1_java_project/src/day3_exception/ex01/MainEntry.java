package day3_exception.ex01;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result =0;
		
		
		try {
			x= new Scanner(System.in).nextInt();
			y= new Scanner(System.in).nextInt();
			
			result = x/y;//문제 발생 코드
			
			
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다."); //user message
			System.out.println(e.getMessage());
			e.printStackTrace();//단계적으로 나눠서 메세지를 출력해준다
		}//try end
		
		
		System.out.println(result);
		
	}
}

/*
public class MainEntry {
	public static void main(String[] args) {
		//예외처리(exception)
		int x=30, y=0;
		int result = 0;
		
		if(y==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}else {
			result = x/y;//예외발생
		}
		
		
		System.out.println(result);
		
	}
}
*/