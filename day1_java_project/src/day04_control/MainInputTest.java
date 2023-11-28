package day04_control;

public class MainInputTest {
	public static void main(String[] args) {
//		System.out.println("Strin, int = ");
		if(args.length <=0) { //Scanner, IO를 안쓸 거면 메인에게 시키는 것
			//그래서 configuration에 계속 변경을 해줘야 해서 고정값이 있을 때 쓰는 것이 좋음
			//Scanner은 값을 계속 여러가지 받아서 쓰고 싶을 때 쓰는 것이 좋음
			System.out.println("데이터를 입력하세요 : ");
			return;//제어권을 넘긴다
		}
		
		String name = args[0];
		int su = Integer.parseInt(args[1]);
		
		System.out.println(name);
		System.out.println(su);
	}

}
