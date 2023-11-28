package day3_control.switc;

import java.util.Scanner;

public class switchMain {
	public static void main(String[] args) {
		System.out.println("point = ");
		
		int point = new Scanner(System.in).nextInt();
		
		switch(point) { // 조건 - 문자형, 정수형, (long형을 제외), 실수형은 안됌
		case 1: System.out.println("집");  //break;
		case 2: System.out.println("피아노"); //break;
		case 3: System.out.println("우산"); //break;
	
		
		}
		System.out.println("상품에 당첨되셨습니다");
	}
	
}



/*
package day3_control.switc;

import java.util.Scanner;

public class switchMain {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s, d, b, j) = ");
		
		//char ch  =  new Scanner(System.in).next().charAt(0); //'s', 'j' <==== s\0, j\0
		String ch  =  new Scanner(System.in).next();//"s" <==== s\0
		
		switch(ch) { // 조건 - 문자형, 정수형, (long형을 제외), 실수형은 안됌
		case "s": System.out.println("서울"); //break;
		case "d": System.out.println("대구"); //break;
		case "b": System.out.println("부산"); //break;
		case "j": System.out.println("제주"); //break;
		
		}
		System.out.println("를(을) 선택하셨습니다");
	}
	
}
*/