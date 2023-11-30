package day09_interface.ex01;

import day09_abstract.ex02.Shape;

interface A{
	int x = 9; //interface - abstract method, final member만 가질 수 있다.
	
	public void show();  //abstract 생략된 것
	public abstract void disp();
	public int plus(int x, int y);
}//A end

interface B{
	void bView()
}

interface C{
	String name ="happy"; //final멤버는 초기화해야 한다.
	public void draw();
	
//	name = "miihee"; // final 멤버는 값을 변경 금지 -상수 
}

interface D extends B{ //interface간에 상속에서도 extends 키워드
	void dView();

}

class Rect implements C {

	@Override
	public void draw() {
		System.out.println(name+ "님 반갑습니다.");
		
	}
	
}

class Multi extends Shape implements B,C,A{
//class Multi implements B,C,A extends Shape { // error

	@Override
	public void draw() {
		System.out.println("interface A");
		
	}

	@Override
	public void bView() {
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int plus(int x, int y) {
		System.out.println("plus call");
		return 222;
	}

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {
//	A a =new A(); //클래스가 아님(객체 생성 안됌)
	
	String name;
	int x, y;
	
	public static void main(String[] args) {
		Multi m = new Multi();
		m.bView();
		m.disp();
		
		Shape s = new Multi(); //부모클래스를 이용해서 객체 생성
		s.calc(5);
		s.view();
		
		B m3 = new Multi(); //부모인터페이스를 이용해서 자손 클래스 객체 생성가능
		m3.bView();
		
		A m4 = new Multi();
		m4.plus(1, 4);
		m4.show();
		
		MainEntry me = new MainEntry();
		
		System.out.println(me.name);
		System.out.println(me.x);
		
		int x=9;
		x=88;
		
		Rect r = new Rect();// 자기 자신으로 객체 생성
		r.draw();
		
		C rr = new Rect(); // 부모 C인터페이스로 객체 생성
		rr.draw();
	}
	
}


/*
 > interface
  - 클래스 아님(객체 생성 안됌)
  - implements
  - 추상메소드, 상수만 가질 수 있다.(abstract, final 생략가능)
  - 다중 상속 구현
*/