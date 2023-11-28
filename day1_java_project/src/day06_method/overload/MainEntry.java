package day06_method.overload;


//overload 오버로드함수
public class MainEntry {
	public static int plus(int x, int y, int z) {
		int hap = x+y+z;
		return hap;
	}
	
	public static double plus(int x, int y, int z, int a) { // 함수원형 타입 -- double
		return x+y+z; // return int
		//returType과 선언하는 Type을 맞추는 것이 정석
	}
	
	public static void add(String str1, String str2) { //함수명은 다 같지면 자료형이 다르면 다 다른 함수라는 것이라고 인식
		System.out.println(str1+str2);
	}
	
	public static void add(int str1, int str2) {
		System.out.println(str1+str2);
	}
	
	public static void add(int str1, String str2) {
		System.out.println(str1+str2);
	}
	
	public static String name(String name, int age) {
		return name+", "+age;
	}
	
	public static void main(String[] args) {
		
	}

}
