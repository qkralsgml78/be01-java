package day07_opp.ex02;

public class MainEntry {

	public static void main(String[] args) {
		Point pt = new Point();
		pt.display();//초기값
		
		pt.setX(130);
		pt.setY(73);
		
		pt.display();//바뀐값
		
		
	System.out.println("\nCircle Object");
	
		Circle c = new Circle();
		c.setR(3); c.setX(100); c.setY(100);
		c.display();
	
	System.out.println("\noppQuizTV");
		oppQuizTV tv = new oppQuizTV("red"); //default 생성자함수를 안만들면 error가 뜸 그래서 매개변수를 넣어줘야함
		tv.setChannel(180);
		tv.setColor("white");
		
		System.out.println("defalut함수 ");
		oppQuizTV tv2 = new oppQuizTV("aqua", 120); //생성자만들면서 변수를 넘기는 것
		oppQuizTV tv3 = new oppQuizTV("green", 77);
		
		tv.displayTV();
	
	}
}
