package day05_array.ex01;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("\n배열의 합 = "+sum);
		
		Scanner sc = new Scanner(System.in);
		int j = 0;
		int []ch1 = new int[5];
		
		for (int i = 0; i <ch1.length ; i++) {
			 j= sc.nextInt();
			 ch1[i] = j;//sc.nextInt(); j안만들고 그냥 바로 입력받아도 됌
		}
		
		for (int i = 0; i < ch1.length; i++) {
			 System.out.println("ch1["+i+"] = "+ch1[i]);
			
		}
	}

}
