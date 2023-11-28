package day06_method;

public class MainEntry {
//	1)매개변수는 없고, 리터타입도 없는 경우
//	public returnType methodName() {   }
	public static void line() { // 함수정의부
		System.out.println("======================");
	}
	
//	2) 매개변수 있고, 리턴타입 없는 경우
//	public returnType methodName(parameter val1, parameter val2, ......)
	public static void showName(String name, int age) {
		System.out.println("당신의 이름은 "+name+"이군요.");
		System.out.println("당신의 나이는"+age+"살");
	}
	
	//함수 정의부가 main보다 위에 있느냐 아래 있느냐에 따라 달라짐
	//컴파일할 때 순차적으로 무엇이 있는지 확인하면서 내려오고 메인에서 함수를 호출하려는데 메인 밑에 정의된 함수정의부를 호출하려고하면 컴파일하려고할 때 못봤다고 하면서 에러를 띄움
	//절차적인 언어일 때는 상관없음 어디에 선언을 하든
	
	public static void main(String[] args) {
		System.out.println("main start");
		showName("박민희", 23);
		line(); // 함수 호출
		display();
		line();
		display();
		line();
		line();
		System.out.println("main end");
		
	} //main에 가서 main에서 끝남
	
	public static void display() { // 함수정의부
		System.out.println("happy minhee");
	}

}
