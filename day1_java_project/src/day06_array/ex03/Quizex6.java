package day06_array.ex03;

import java.util.Iterator;

public class Quizex6 {
	public static void main(String[] args) {
		int[][] score =  { { 98, 98, 90, 92, 99 },
							{ 81, 82, 83, 84, 85 },
							{ 71, 73, 75, 77, 79 },
							{ 60, 65, 60, 65, 69 },
							{ 77, 74, 79, 78, 72} };
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				}
				System.out.println(i+"행의 총점은"+sum+"평균은"+sum/score[i].length);
				sum =0;
				
		}
	}

}
