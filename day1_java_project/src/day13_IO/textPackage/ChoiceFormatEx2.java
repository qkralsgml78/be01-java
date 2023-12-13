package day13_IO.textPackage;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
	public static void main(String[] args) {
			String pattern = "50#F|60#D|70#C|80#B|90#A" ; //|로 구분해서 한 세트다
//			String pattern = "90#A|80#B|70#C|60#D|50#F"; //낮은 값에서 부터 올라가야지 오류가 안 남
			
			int[] score = { 100, 95, 70, 55, 60, 70 };
			
			ChoiceFormat  form = new ChoiceFormat(pattern);
			for(int i=0; i < score.length; i++) {
				System.out.println(score[i] + " : " + form.format(score[i])); //학점 배열을 안 넣었지만 앞에 클래스랑 똑같이 form.format에 점수를 가지고 가서 pattern에서 맞는 학점을 출력해줌
			}
	}
}
