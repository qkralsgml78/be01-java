package day03_control.For;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz_sum {
	public static void main(String[] args) { 
		
		
		//과제3]
		
		System.out.print(1+".\t");
			
		System.out.println("\n");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("\t");
		}
		
		System.out.print(2+".\t");
		
		System.out.println("\n");
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("\t");
			
		}
	
	}
}
		
		/*
		 
		과제2]
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자 두개를 입력하세요 : ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		
		System.out.println("계산할 사칙연산자(+,-,*,/)를 입력: ");
		String num3 = sc.next();
		
		int result=0;
		
		switch(num3) {
		case "+":
			result = num1+num2;  break;
		case "-":
			if(num1>num2) result = num1-num2;
			else result = num2-num1; break;
		case "*":
			result = num1*num2; break;
		case "/":
			if(num1>num2) result = num1/num2;
			else result = num2/num1; break;
		}
			if(num1>num2) System.out.println(num1+num3+ num2+" = "+result);
			else System.out.println(num2+num3+ num1+" = "+result);
			*/


		
		/*
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("1~100 sum : "+sum);
		*/
	 


