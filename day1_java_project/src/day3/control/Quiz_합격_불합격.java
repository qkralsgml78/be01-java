package day3.control;

import java.util.Scanner;

public class Quiz_합격_불합격 {
	public static void main(String[] args) {
		System.out.println("kor = "); int kor = new Scanner(System.in).nextInt();
		System.out.println("Eng = "); int eng = new Scanner(System.in).nextInt();
		System.out.println("com = "); int com = new Scanner(System.in).nextInt();
		
		double avg = kor+eng+com / 3.0;
		
		if(avg >=60) {
			if(kor>=40 && eng >= 40 && com >= 40) {
				System.out.printf("모든 과목이 40점 이상이며 평균이 %.2f로 [합격]입니다.\n", avg);
			}else {
				System.out.printf("평균은 %.2f이지만",avg);
				if(kor <40)System.out.println("국어"+kor+"점");
				if(eng <40)System.out.println("영어"+kor+"점");
				if(com <40)System.out.println("전산"+kor+"점");
				System.out.println("으로 과락탈락입니다.");
			}
		}else{
			System.out.printf("평균은 %.2f미달로 [평균 미달 탈락]입니다", avg);
		}
		
	}

}
