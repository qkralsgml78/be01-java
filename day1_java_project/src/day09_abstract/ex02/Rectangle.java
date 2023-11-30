package day09_abstract.ex02;

public class Rectangle extends Shape {

	@Override
	public double calc(double x) {
		result = x*x;
		return result;
	}

	@Override
	public void show(String name) {
		System.out.println(result+"반지름의"+name+"이 그려졌습니다.");

	}

}
