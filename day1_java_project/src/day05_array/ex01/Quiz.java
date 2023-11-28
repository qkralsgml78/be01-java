package day05_array.ex01;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		int[] numlist = {1,2,3,4,5};
		int[] numlist2 = new int[5];
		
		
		for(int i=numlist.length-1, j=0; i>=0; i--, j++) {
			numlist2[j] = numlist[i];
			
		}
		for(int i =0; i<5; i++) {
			System.out.println(numlist[i]+"을 거꾸로 출력: "+numlist2[i]);
		}
	}

}
