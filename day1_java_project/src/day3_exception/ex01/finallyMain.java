package day3_exception.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finallyMain {
	
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result =0;
		
		
		try {
			x= new Scanner(System.in).nextInt();
			y= new Scanner(System.in).nextInt();
			
			result = x/y;//문제 발생 코드
			System.out.println(x+"/"+y+" = "+result);
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println(e.getMessage()); //user message
			e.printStackTrace();//단계적으로 나눠서 메세지를 출력해준다
		}catch(Exception e){
			System.out.println("Exception");
			System.out.println(e.getMessage());
			e.printStackTrace();//단계적으로 나눠서 메세지를 출력해준다
		}finally {
			System.out.println("finally가 무조건 처리됌!!");
		}
		
		
		System.out.println(result);
		
	}

}
