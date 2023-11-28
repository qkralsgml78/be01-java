package day3_control.switc;

import java.util.Scanner;

public class QuizIFScore {

	public static void main(String[] args) {
		System.out.println("input jumsu(k,e,c) : ");
		
		Scanner sc = new Scanner(System.in);
		
		int total = (sc.nextInt()+ sc.nextInt()+ sc.nextInt());
		double avg = (double)total/3;
		char grade;
		
		if(total/30==9) {
			grade = 'A';
		}else if(total/30 == 8) {
			grade = 'B';
		}else if(total/30 == 7) {
			grade = 'C';
		}else if(total/30 == 6) {
			grade = 'D';
		}else
			grade = 'F';
		
		System.out.println("\n\n평균은"+avg+"이고 점수는 "+grade);
	}
	
}
