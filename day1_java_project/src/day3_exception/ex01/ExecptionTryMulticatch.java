package day3_exception.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecptionTryMulticatch {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try{
			System.out.println("정수 두개 입력하세요: ");
			System.out.println("integer 1> "); int num1 = sc.nextInt();
			System.out.println("integer 2> "); int num2 = sc.nextInt();
			System.out.println("num1/num2  = "+(num1/num2));
			
		}catch(InputMismatchException e){
			System.out.println("InputMismatchException");
			System.out.println("0으로 나눌 수 없다.");
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
			System.out.println("0으로 나눌 수 없다.");
		}catch(Exception e){
			System.out.println("Execption");
			System.out.println("0으로 나눌 수 없다.");
		}
		
		
	}

}
