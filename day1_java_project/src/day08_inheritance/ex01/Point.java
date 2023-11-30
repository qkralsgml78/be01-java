package day08_inheritance.ex01;

public class Point {
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	protected int x, y;
	
	public Point() {
//		this(100, 100); //this로 했기 때문에 public Point(int x, int y)가서 계속 출력된 것
		x = y =100;
		System.out.print("Point default constructor");
		
	}
	
	public Point(int x) {
//		this(x,0);
		this.x = x;
		System.out.println("Ponit 1개 constructor call");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Ponit 2개 constructor call");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void disp() {
		System.out.println(x+", "+y);
	}
	

}
