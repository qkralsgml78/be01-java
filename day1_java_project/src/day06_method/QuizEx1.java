package day06_method;

import java.util.Scanner;

public class QuizEx1 {
	public static void info() {
		Scanner sc= new Scanner(System.in);
		String name = sc.next();
		int num = sc.nextInt();
		String add = sc.next();
		System.out.println("이름, 나이, 주소를 입력하세요: ");
		System.out.println("이름은 "+name+"이며 나이는 "+num+"살, 주소는 "+add+"입니다.");
	}
	
	public static void abs(int x) {
		if(x>0) {
			System.out.println(x); // x =x
		}System.out.println(-x);  //x = -x
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 주소를 입력하세요: ");
		info();
		System.out.println("두개의 정수를 입력하세요: ");
		max();
		max();
	}
	
	public static void max() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x , y =");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= 0;
		c= a>b? a:b;
		System.out.println("두 수 중의 제일 큰 값은"+ c);
		
		/*int c= 0;
		c= a>b ? a:b;
		System.out.println("두 수 중의 제일 큰 값은 "+c);
		*/
	}

}
