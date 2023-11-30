package day09_abstract.ex01;

abstract class Shape { // abstract class, super class
	double result = 0;
	public abstract double calc(); // abstract method
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
	
}//Shape end

class Circle extends Shape{ //Shape class
	double r = 5.0;

	
	@Override
	public double calc() { //자식 클래스는 꼭 부모클래스에서 정의한 추상메소드를 재정의해서 가져와야함(부모의 가보)
		result = r*r*Math.PI;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("원의 넓이: "+ result+ "인 원을 그렸습니다.");
		
	}
}
	
class Triangle extends Shape {
	int w =3, h = 5;

	@Override
	public double calc() {
		result = (w*h) /2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이: "+result+"인 삼각형을 그렸습니다.");
		
	}
	
}//Triangle end 

class Rectangle extends Shape{
	int x = 6, y=3;
	@Override
	public double calc() {
		result = x*y;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("x 곱하기 y = "+result+"입니다.");
		
	}
	
}

public class MainEntry {

	public static void main(String[] args) {
		Circle c= new Circle();
		c.calc();
		c.draw();
		
		Triangle t = new Triangle();
		t.calc();
		t.draw();
		
		Rectangle r = new Rectangle();
		r.calc();
		r.draw();
		
		//Shape s = new Shape(); 자체적으로 객체를 생성할 수 없다.
	}
}
