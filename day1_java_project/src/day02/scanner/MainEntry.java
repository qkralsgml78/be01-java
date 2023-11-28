package day02.scanner;

import java.util.Scanner;
//패키지 임포트하기: import ,java.lang은 안해도 됌

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data input : ");
		int su= sc.nextInt();
		System.out.println(su);
		System.out.println("name input: ");
		String name= sc.next();
		
		System.out.println(su+", name: "+name);
	}

}
