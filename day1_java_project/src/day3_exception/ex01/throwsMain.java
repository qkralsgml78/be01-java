package day3_exception.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwsMain {
	public static void main(String[] args) {
		//throws ArithmeticException, InputMismatchException{// 예외처리 위임
		throws Exception{
				
				//시스템이 내뱉는 오류와 JVM이 내뱉는 오류가 다르기에 예외처리를 하는 것
	
		System.out.println("x, y = ");
		int x, y, result =0;

		x= new Scanner(System.in).nextInt();
		y= new Scanner(System.in).nextInt();
		
		result = x/y;  //문제 발생 코드
		
	
		System.out.println(x+"/"+y+"= "+result);
		}
		
	}
}
