package day02.operator;

import java.util.Scanner;

public class QuizScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수는?");// or new Scanner(System.in).nextInt(); 선언과 동시에 input받기
		int a= sc.nextInt();
		System.out.println("영어 점수는?");
		int b= sc.nextInt();
		System.out.println("전산 점수는?");
		int c = sc.nextInt();
		int total = a+b+c;
		double result;
		
		result = (double)total/3; //or total/3.0
		
		
		System.out.println(sc.next()+"의 성적표****\n");
		System.out.println("국어: "+a+", 영어: "+b+", 전산: "+c);
		System.out.println("총점: "+total);
		System.out.println(String.format("평균: %.2f", result));
	}

}
