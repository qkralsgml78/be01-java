package day3_control.switc;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("당신의 포인트 점수는(1~3점) input: ");
			
			int point = new Scanner(System.in).nextInt();
			
			switch(point) { // 조건- 문자형, 정수형(long형)을 제외, 실수형 안됌
			case 1://숫자, "문자", "문자열"
				System.out.println("포인트 점수는 1점 입니다.");
				break;
			case 2:System.out.println("포인트 점수는 2점 입니다."); break;
			case 3:System.out.println("포인트 점수는 3점 입니다."); break;
			default: System.out.println("없는 점수입니다. 1~3까지만 입력하세요");
			}//switch end
			
	}

}
