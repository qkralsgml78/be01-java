package day09_abstract.ex02;

public class Triangle extends Shape {

	@Override
	public double calc(double x) {
		result = (x*x)/2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(93.3);
		System.out.println("삼각형은"+result+"이름은"+name);

	}

}
