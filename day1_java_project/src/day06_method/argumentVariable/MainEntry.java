package day06_method.argumentVariable;

public class MainEntry {
	public static void plus(int...x) { //기변길이 배열
		int sum =0;
		for (int i = 0; i < x.length; i++) {
			sum+=x[i];
		}
		System.out.println(sum);
		
	}
	
	public static void plus(int x, int y) {
		int hap = x+y;
		System.out.println(hap);
	}
	
	public static void plus(int x, int y, int z) {
		int hap = x+y+z;
		System.out.println(hap);
		
	}
	
	public static void plus(int x, int y, int a, int b, int c) {
		int hap = x+y+a+b+c;
		System.out.println(hap);
		
	}
	
	public static void main(String[] args) {
		
	}

}
