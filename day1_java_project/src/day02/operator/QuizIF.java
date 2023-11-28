package day02.operator;

import java.util.Scanner;

public class QuizIF {
	public static void main(String[] args) {
		
		
//		while(true) {
//		System.out.println("년도를 입력하세요:");
//		int su = new Scanner(System.in).nextInt();
//		
//			if(su%4 == 0){
//				if((su%100 !=0)||(su%400 ==0)) {
//					System.out.println("평년 "+su+"년");
//				}
//			System.out.println("윤년 "+su+"년");
//			}else System.out.println("평년도 윤년도 아니다.");
//		}
//		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요:");
		int a = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요:");
		int b = sc.nextInt();
		
		System.out.println("전산 점수를 입력하세요:");
		int c = sc.nextInt();
		
		int sum = a+b+c;
		int avg = sum/3;
	
		if(avg>=60) {
			if((a<=40)&&(b<=40)&&(c<=40)) {
				if((a<=40)&&(b<=40)&&(c<=40)) {
					System.out.println("모든 과목이 미달입니다");
				}else if((a<=40)&&(b<=40))
				System.out.println("국어와 수학이 미달입니다.");
				else if((b<=40)&&(c<=40)) {
					System.out.println("수학과 전산이 미달입니다.");
				}else if((a<=40)&&(c<=40)) {
					System.out.println("국어와 전산이 미달입니다.");
				}else if(a<=40) {
					System.out.println("국어만 미달입니다.");
				}
			}
		}else System.out.println("합격입니다.");
	}
}
	


//public class QuizIF {
//	public static void main(String[] args) {
//		
//		
//		while(true) {
//		System.out.println("integer input su:");
//		int su = new Scanner(System.in).nextInt();
//		System.out.println("integer input su2:");
//		int su2 = new Scanner(System.in).nextInt();
//		
//			if(su>su2) {
//				System.out.println("큰 수는 "+su);
//				System.out.println("작은 수는 "+su2);
//			}else {
//				System.out.println("큰 수는 "+su2);
//				System.out.println("작은 수는 "+su);
//			}
//		}
//	}
//}
