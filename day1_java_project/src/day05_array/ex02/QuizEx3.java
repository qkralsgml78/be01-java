package day05_array.ex02;

import java.util.Iterator;
import java.util.Scanner;

public class QuizEx3 {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int [][] a = new int[3][4];
		int sum = 0;
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("a["+i+"]["+j+"] =");
				if(i == 2) {
					a[2][j] = a[0][j]+a[1][j];
					
				}else {
					a[i][j] = sc.nextInt();
				}
				
			}
			
			}
		for(int k =0; k<a.length; k++) {
			for (int j = 0; j < a[k].length; j++) {
				System.out.println("a["+k+"]["+j+"] ="+a[k][j]);
			}
			
		}
	}
}

		
		/*
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+"행의 숫자를 4개 입력");
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
				
			}
			
		}
		for (int i = 0; i < a[i].length; i++) {
			for (int j = 0; j < a.length; j++) {
				sum+= a[j][i];
			}
			System.out.println("열의 합은: "+sum);
			sum=0;
		}
		*/
		

	
