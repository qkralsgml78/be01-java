package day09_abstract.ex02;

public abstract class Shape {
	
	double result = 0;
	
	public abstract double calc(double x); //추상메소드
	public abstract void show(String name);
	
	
	public void view() {
		System.out.println("super class Shape입니다.");
	}

}
