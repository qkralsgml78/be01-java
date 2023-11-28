package day06_method.overload;


//함수이름을 똑같이 해도 변수명이 다르고 자료형 다르고 개수가 다르면 다른 함수로 취급
public class OverloadMain {
	public static void Line() {
		System.out.println("--------------");
	}
	
	public static void Line(String str) {
		for(int i = 1; i <11; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void Line(String str, int n) {
		for(int i = 1; i <n; i++) {
			System.out.print(str);
		}
		System.out.print();
	}
	
	
	public static void main(String[] args) {
		Line("&", 15);
		Line("\n*");
		
	
	}
	


}
