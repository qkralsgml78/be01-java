package day05_array.ex02;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][]a = new int[3][3];
		int sum = 0;
		
		System.out.println("숫자를 입력하세요 : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
				sum+= a[i][j];
				
			}
			
		}
		System.out.println("임의의 수 합계 : "+sum);
		
	}

}
