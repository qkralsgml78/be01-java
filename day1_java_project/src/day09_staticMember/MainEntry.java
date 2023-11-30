package day09_staticMember;

class Atm{
	int count; //instance member
	static int total; //static member
	
	
	public Atm(int amount) { //매개변수 하나 생성자 함수 (은행들어올 때 입금하는 행동)
		count +=amount;
		total +=amount;
		
	}
	public static void view() {
//		count +=100; //static method에서는 static멤버 변수만 사용 가능해서 일반멤버변수는 사용 불가
		total +=100;
	}
	
	public void show(int count, int total) {
		this.count = count;
//		this.total = total; // static member에는 this사용하지 않는다. (공간을 계속 만들지 않기 때문에)
	}
	public void disp() { //instance method에서는 둘다 사용 가능함
		count += 200;
		total += 200;
		System.out.println("count = "+count);
		System.out.println("total = "+total);
	}
	
	
}

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atm at = new Atm(1000);
		at.disp(); //c:? ,  t:?
	}

}
