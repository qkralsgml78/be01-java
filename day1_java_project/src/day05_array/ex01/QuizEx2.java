package day05_array.ex01;

import java.util.Scanner;

//문제2]11월 한달간(30)의 강수량을 입력 받아서, 평균 구하는 프로그램 작성
public class QuizEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su=10, cnt =0;
		double avg = 0; 
		double[] arr = new double[su];//배열의 크기를 코드를 쓰면서 바꾸고 싶으면 변수하나를 만들어 그것으로 배열을 크기를 바꾸면 됌
		
		System.out.println("강수량을 입력하세요 : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			avg += arr[i];
			cnt++;
		}
		
		avg /=arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("한달간 강수량은 : "+ arr[i]);
		}
		
		System.out.printf("\n강수량 평균은 : %.2f 입니다.", avg);
	}

}
