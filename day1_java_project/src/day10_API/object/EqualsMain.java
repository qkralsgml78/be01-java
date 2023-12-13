package day10_API.object;

class Circle{
	int x, y;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		if(c1 ==c2) System.err.println("same");
		else System.out.println("not same");
		
		System.out.println(c1.hashCode()+", "+c2.hashCode());
		
		int x=3, y=5;
		
		System.out.println("기본 자료형 비교");
		if(x == y) System.err.println("same");
		else System.out.println("not same");
		//stack영역에서 바로 값을 비교하기 때문에 y 값을 3으로 바꾸면 same이 나옴
		
		
		String s1 = new String("Korea");
		String s2 = new String("koreA");
		

		System.out.println("참조 자료형 비교");
		if(s1 == s2) System.err.println("same");
		else System.out.println("not same");
		//heap주소를 비교하기 때문에 다름 not same이 나옴
		
		
		//stack영역에서 바로 값을 비교하는 함수 equals 함수
		System.out.println("***** equals method******");
		if(s1.equals(s2)) System.err.println("same");//대소문자 구분함
		else System.out.println("not same");
		
		System.out.println("***** equals method******");
		if(s1.equalsIgnoreCase(s2)) System.err.println("same");//대소문자 구분 안함
		else System.out.println("not same");
		
	}

}
