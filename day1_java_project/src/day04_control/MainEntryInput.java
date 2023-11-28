package day04_control;

import java.util.Scanner;

public class MainEntryInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("integer, name input : ");
//		String name = sc.nextLine(); //Line이 먼저 불려지면 상관이 없음
//		int su =sc.nextInt(); 
		//숫자, 문자를 입력 받게 되는 상황이면 문자를 먼저 입력 받고 숫자를 입력 받아야 입력이 제대로 됌
		
		System.out.println("integer, name input : ");
		String name = sc.nextLine(); //buffer에 int가 엄저 들어가 있음
		int su =sc.nextInt(); 
		//memory에 가려면 -> buffer(버퍼에 있는 입력받는 것은 엔터를 쳐야지 들어감) -> memory에 들어감 
		// 메모리 상에 int, char 공간이 나오는데 메모리에 입력한 숫자가 바로들어가는 것이 아니라 엔터를 쳐야지 buffer에 있는 우리가 입력한 int값이 메모리에 들어가게 됌
		// 그다음에 char을 받으려고 커서가 다음 메모리에서 받는 값을 기다려도 buffer에 있는 화이트 스페이스가 엔터를 치지도 않았는데 메모리에 들어가기에 다음 문자열을 받을 수 없음
		
		
		System.out.println(su+", "+name);
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("integer, double, char data input : ");
		//String name = sc.next(); //next()는 공백을 인식 못함 스페이스바까지 인식을 함
		String name =sc.nextLine(); // 공백까지 출력을 하고 
		
		System.out.println(name);
		*/
		
		
		
		
		/*
		System.out.println("정수 데이터 입력 요망: ");
		Scanner sc =  new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자함수 자동호출
		
		System.out.println("integer, double, char, data input : ");
		int x = sc.nextInt();
		double y = sc.nextDouble();
		char ch = sc.next().charAt(0);//0번째 것을 입력해줘
		
		System.out.println(x+"+"+y+"="+ch);
		
		
	
		int x=3, y=5;
		String flag = "";
		String name = null;
		
		if (x ==5) System.out.println("same");
		else System.out.println("not same");
		
		String s1 = new String("korea");
		
		String s2 = new String("korea"); //new라고 선언되어 있는 변수들은 다 heap영역에 저장이 됌
		//system 크기는 int형을 따라감
		//객체는 
		
		if (s1 == s2) { //== 기호는 stack영역에 있는 데이터(주소)를 비교하기에 같지 않다는 답이 나옴
			System.out.println("same");
		}else System.out.println("not same");
		if (s1.equals(s2)) System.out.println("same"); //equalsIgnore은 대소문자를 구분 X, equals는 대소문자를 구분
		else System.out.println("not same");
		
		if(flag.toUpperCase().equals("N")) break; //입력받은 모든 문자를 대문자로 변환해서 받는 것
		if(flag.toLowerCase().equals("n")) break; //입력받은 모든 문다를 소문다로 변환해서 받는 것
		*/
	}

}
