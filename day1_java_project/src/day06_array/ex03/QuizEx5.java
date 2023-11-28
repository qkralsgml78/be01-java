package day06_array.ex03;

import java.util.Iterator;

//3차원 형태
//임의적인 데이터 입력받아서 출력하기
public class QuizEx5 {
	public static void main(String[] args) {
		int[][][] a = new int[2][2][3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int j2 = 0; j2 < a[i][j].length; j2++) {
					a[i][j][j2] = (int)(Math.random()*100);//0~99까지의 랜덤값 형성
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int j2 = 0; j2 < a[i][j].length; j2++) {
					System.out.print(a[i][j][j2]+"\t");
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
