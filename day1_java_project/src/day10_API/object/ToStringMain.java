package day10_API.object;

class RecTangle{
	int x, y;
	
	public void disp() { //user method
		System.out.println(x+", "+y);
	}
	
	
	
//	@Override
//	public String toString() {
//		String st = x+", "+y;
//		return st;
//	}
	
}

public class ToStringMain {
	public static void main(String[] args) {
		RecTangle r =new RecTangle();
		r.disp();
		System.out.println(r);
	}

}
