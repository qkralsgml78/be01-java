package day06_method;

public class MainEntry2 {
//3)매개변수 없고, 리턴타입 있는 경우
//public returnType methodName() {   return value;    }
	public static String show() {
		//return "Hello world!"
		String str = "Hello world!";
		return str;
	}
	
	public static int iShow() {
		int su = 99;
		return su;
	}
	
//4)매개변수 있고, 리턴타입 있는 경우
//public returnType methodName() {parameter val1, parameter val2, ....)
	public static int plus(int x, int y) {
		int hap = x+y;
		return hap;  //return x+y;
	}


	
	public static void main(String[] args) {
		int add = plus(1,2);
		System.out.println(add);
		System.out.println(plus(3,5));
		
		//1.
		System.out.println(iShow());
		//2.
		int num = iShow(); //함수를 변수에 넣어서 출력 가능
		System.out.println(num);
		
		
		//3.
		String msg = show();
		System.out.println(msg);
		//4.
		System.out.println(show());
	}
}
