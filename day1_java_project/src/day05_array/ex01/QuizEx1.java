package day05_array.ex01;

public class QuizEx1 {
	public static void main(String[] args) {
	
		int[] su = {1, 7,  4, 7, 5, 9, 3, 24, 6, 7, 98, 7, 7, 7, 7};
		int j = 7;
		int cnt = 0;
		
		for (int i = 0; i < su.length; i++) {
			if(j == su[i]) {
				cnt++;
			}
		}
		System.out.println("7의 갯수는 : "+cnt);

	}
	
}
