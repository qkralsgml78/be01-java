package Quiz.scoreClass;

import java.util.Scanner;

//3과목 입력받고 총점, 평균, 학점(if, switch)구하기
public class MainEntry {
	public static void main(String[] args) {
		Score sc = new Score();
		sc.disp();//초기값
		
		sc.setName("박민희");
		sc.setK(45);
		sc.setE(73);
		sc.setC(83);
		
		//Score sc2 = new Score(94, 83, 38);
		
		sc.setT(sc.getK()+sc.getE()+sc.getC());
		
		sc.setA(sc.getT());
		
		
		
		sc.disp();
		
	}

}
