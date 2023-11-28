package day06_method;

import java.util.Scanner;

public class QuizEx2 {
	public static int plus(int x, int y, int z) {//return X
		int hap = 0;
		hap = z+x+y;
		return hap;
		
	}
	
	public static void sub(int a, int b) {
		int hap =0;
		if(a>b) {
			hap = a-b;
		}else hap =b-a;
		
		System.out.println("두 수의 빼기는 "+hap);
	}
	
	public static int mul(int x, int y) {
		int sum = 0;
		sum = x*y;
		
		return sum;
	}
	
	public static int div(int x, int y) {
		int z = 0;
		if(x>y) {
			z = x/y;
		}else z = y/x;
		
		return z;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {  // 무한루프
			System.out.println("integer data input(1,2,3,4,0) = ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("덧셈함수 호출: x, y, z = ");
				int result = plus(sc.nextInt(), sc.nextInt(), sc.nextInt());
				System.out.println("plus = "+result);
				break;
			case 2:
				System.out.println("뺄셈함수 호출: x, y = ");
				sub(sc.nextInt(), sc.nextInt());
				break;
			case 3:
				System.out.println("나눗셈함수 호출 x, y = ");
				div(sc.nextInt(), sc.nextInt());
				break;
			case 4:
				System.out.println("곱셉함수 호출 x, y = ");
				mul(sc.nextInt(), sc.nextInt());
				break;
			case 0:
				System.out.println("프로그램 종료합니다.");
				System.exit(0); // 무한루프는 탈출구문이 있어야 함.
			
			}
		}
	}

}
