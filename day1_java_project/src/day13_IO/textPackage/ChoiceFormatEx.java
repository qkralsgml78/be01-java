package day13_IO.textPackage;

import java.text.ChoiceFormat;

public class ChoiceFormatEx {
	public static void main(String[] args) {
		
		double[]  limits = { 50, 60, 70, 80, 90 } ;  // 낮은 값부터 큰 값의 순서로 적어줌
		String[]  grades = { "F", "D", "C", "B", "A" }; 
		
		int[] score = { 100, 95, 70, 55, 60, 70 };
		
		ChoiceFormat  form = new ChoiceFormat(limits, grades); //생성자함수 인자 2개
		for(int i=0; i < score.length; i++) {
			System.out.println(score[i] + " : " + form.format(score[i]) + "학점");//form.format에 점수를 들고 들어가서 ChoiceFormat에서 생성된 limits, grades에 점수를 넣고 점수에 맞는 학점을 출력
		}
	}
}
