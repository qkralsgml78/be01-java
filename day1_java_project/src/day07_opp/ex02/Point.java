package day07_opp.ex02;

public class Point {
	private int x, y;
	
	public Point() { //default constructor
		x=93;
		y=7;
	}
	
	
	public Point(int x, int y) { //생성자함수 정의
		this.x = x;
		this.y = y;
	}



	public void setX(int xx) {x=xx;}
	public int getX() {return x;}
	
	public void setY(int yy) {y =yy;}
	public int getY() {return y;}
	
	public void display() {
		System.out.println(getX()+", "+getY());
	}
}
