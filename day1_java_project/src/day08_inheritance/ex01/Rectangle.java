package day08_inheritance.ex01;

public class Rectangle extends Point {
	private int x2, y2;
	
	public Rectangle() {
		x2 = 5;
		y2 = 73;
		System.out.println("Rectangle default constructor call");
	}
	
	public void Rectangle(int x2) {
		this.x2 = x2;
		System.out.println("Rectangle constructor 1개 call");
		
	}
	
	public void Rectangel(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("Rectangle constructor 2개 call");
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void disp() {
		super.disp();
		System.out.println(x2+", "+y2);
	}

}
