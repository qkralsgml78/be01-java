package day09_interface.ex02;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		BB b =new BB();
		b.draw();
		b.show();
		
		//2.
		IDraw bb= new BB();
		bb.draw();
		//부모에서 자식을 가져 온것이기에 show가 안 보이는 것
		//부모 것만 불러 올 수 있음
		
		
	}

}
