package day03_control.For;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
	
		int cnt = 0;
		int sum = 0;
		//3의 배수의 합과 개수를 구하는 프로그램 작성 (배수는 그 수로 나누어서 0으로 떨어지는 숫자가 배수다)
		for(int i=1; i<=100; i++) {
			if(i % 3 ==0) {
				sum += i;
				cnt++;
				}
			}
			
		System.out.println("3의 배수의 합은 "+sum+" 개수는 "+cnt);
	}
}
		
		/*
		Scanner sc = new Scanner(System.in);
		
		
		int result = 0;
		
		System.out.println("숫자입력: ");
		for (int num1= sc.nextInt(); num1 <=9; num1++) {
			for(int num2 =1; num2 <=9; num2++) {
				System.out.println(num1+"*"+num2+"="+(num1*num2));
			}
			System.out.println("\n");
		}
		/*
		//println 한줄로 출력해줘
		//print 그냥 출력
		for(int i=1; i<=10; i++) {
			System.out.print("*");
			if(i%2 == 0) {
				System.out.println("\n");
			}
		}
		/*
		for(int i=1; i<=101; i++) {
			System.out.print(i+"\t");
			if(i %10 == 0) {
				System.out.println("\n");
			}
			
		}
		*/
		/*
		for(int i=1; i<=10; i++) {
			System.out.println("Hi~!");
		}//블럭이 닫히는 순간 이 메모리에서 끝나기에 다른 블럭에서 i를 써도 됌

*/