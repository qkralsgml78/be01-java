package day07_opp.ex01;

class Point { //한 package에 class가 여러개가 있을 때는 하나의 class에만 public을 지정함 
	private int x, y; //멤버 변수, int 0, double/float 0.0, String null로 초기화 된다.
	
	//멤버함수
	 public void setX(int xx) { x = xx; }
	 public int getX() { return x; }
	 public void setY(int yy) { y = yy; }
	 public int getY() { return y; }
	 
	 public void display() {
		 
		 //System.out.println(x+", "+y);
		 System.out.println(getX() +", "+getY());
		 
	 }
}//point end

class circle{
	private int x, y, r;
	//getter /setter
	public void setX(int xx) {x =xx;}
	public int getX() {return x;}
	
	public void setY(int yy) {y =yy;}
	public int getY() {return y;}
	
	public void setR(int rr) {r =rr;}
	public int getR() {return r;}
	
	public void display() {
		System.out.println("입력 후\n"+getX()+", "+getY()+", "+getR());
	}
	
	//output
}

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("========================");
		
		Point pt = new Point(); // Point함수에 대한 객체생성, 메모리에 할당, 생성자함수 자동호출
		
		System.out.println(pt.getX()+", "+pt.getY());
		
		pt.setX(55);   pt.setY(220);
		System.out.println(pt.getX()+", "+pt.getY());
		
		pt.display();
//		pt.x = 3;
//		pt.y = 5;
//		
//		System.err.println(pt.x+", "+pt.y);
		
		
		circle cc =new circle(); //circle함수에 대한 객체 생성, 메모리할당, circle생성자함수 자동호출
		System.out.println("circle함수 값 입력 전\n"+cc.getX()+", "+cc.getR()+", "+cc.getY());
		cc.setR(12);  cc.setX(39);   cc.setY(74);
		
		cc.display();
		

		
	}

}//main end
