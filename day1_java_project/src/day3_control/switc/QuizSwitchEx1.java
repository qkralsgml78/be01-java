package day3_control.switc;

import java.util.Scanner;

public class QuizSwitchEx1 {
	public static void main(String[] args) {
	
		System.out.println("숫자를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		//int result = num % 2;
		
		
		switch(num%2) {
		case 0:
			System.out.println("짝수입니다."); break;
		case 1:
			System.out.println("홀수입니다."); break;
		//default: System.out.println("홀수입니다.");
		}
		
		
	}
	

}
