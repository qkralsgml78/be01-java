package day05_array.ex01;

public class ForeachTest {
	public static void main(String[] args) {
		int []ch1 = {1,2,3,4,5};
		
		for (int i = 0; i <ch1.length ; i++) {
			System.out.println(ch1[i]);
		}
		System.out.println("====================");
		int x= 1;
//		for(자료형 변수명 : 배열명 또는 컬렉션명) {   }
		for(int item : ch1) { // 중간에 끝을 수가 없음 처음부터 끝까지 출력해야 함
			//중간에 끝고 싶으면 다른 변수를 하나 선언하고 if문으로 통해 끝어주면 됌
			System.out.println(item);
		}
		
		int[] score = {78, 90, 39, 99, 53};
		int sum = 0;
		
		System.out.println("\n");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
			
		}
		System.out.println("\n====================\n");
		for(int item: score) {
			sum+=item;
			
		}
		System.out.println(sum);
		
	}

}

	/*
	for(자료형 변수명 : 컬렉션명 or 배열명){
		반복구문
	}
	*/