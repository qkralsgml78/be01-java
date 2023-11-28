package Quiz.ex01;

import java.util.Scanner;

//3과목 입력받고 총점, 평균, 학점(if, switch)구하기
public class score {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자함수자동호출
		
		System.out.println("name = ");
		String name = sc.next();
		
		System.out.println("국어, 수학, 영어 성적을 입력하세요: ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int su = sc.nextInt();
		
		
		int total = (kor+ eng+ su);
		double avg = (double)total/3;
		char grade;
		
		/*
		if(avg==100 || avg>=90) {
			grade = 'A';
		}else if(avg >=80 && avg<=90) {
			grade = 'B';
		}else if(avg>=70 && avg<=80) {
			grade ='C';
		}else if(avg>60 && avg<=70) {
			grade = 'D';
		}else { 
			grade = 'F';
		}
		System.out.printf("평균은  %.2f 학점은 %s", avg, grade);
		*/
		switch(total/30) {
		case 10: case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		case 5: grade='E'; break;
		default : grade='F';
		}
		System.out.println(name+"의 성적표는********");
		System.out.printf("국어 성적: %d, 수학성적: %d, 영어성적: %d", kor, eng, su);
		System.out.printf("\n평균은 %.2f 성적은 %s",avg, grade);
	}

}
