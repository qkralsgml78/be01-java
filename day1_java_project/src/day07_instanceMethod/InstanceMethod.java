package day07_instanceMethod;

/*
	instance Method : 객체를 생성하고 사용해야함
 */

class B{
	int x, y;
	
	public void setData(int xx, int yy) {
		System.out.println(xx+", "+yy);
	}
	
}

public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B();//객체생성, 메모리할당, 생성자함수 자동호출
		b.setData(100, 200);
	}

}
