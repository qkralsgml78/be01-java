package day07_staticMethod;


/*
2. static method : 객체 생성 없이 바로 사용 가능 함
	objectName.methodName();
	ClassName.methodName();
	ex)Math.random();
	Math = objectName / random(); = methodName();

*/

class A{
	int x, y;
	
	//static method
	public static void setData(int xx, int yy) {
		System.out.println(xx +", "+yy);
	}
}// A end

public class MainEntry {
	public static void main(String[] args) {
	
		A.setData(3, 5); // ClassName.methodName();
		A obj = new A(); // 객체생성, 메모리에 할당, 생성자함수 자동호출
		obj.x = 9;
		System.out.println(obj.x);
		obj.setData(1, 2); // objectName.methodName();
		A.setData(50, 30); // ClassName.methodName();
	}
	
}
