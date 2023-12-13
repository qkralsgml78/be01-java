package day13_IO.ex01;

public class InputStreamEx {
	public static void main(String[] args) {
		
		System.out.print("input : ");
		
		try {
			int su;
			
			while((su = System.in.read()) != -1) { //더이상 입력 받을 것이 없으면 -1을 입력하면서 반복문 끝 
				if(su == 10 || su ==13 || su == 32) continue; //su가 10, 13, 32면 while문으로 다시 돌아감
				if(su == 113|| su == 81) break; //su가 113, 81이면 반복문 종료
				
				char ch = (char)su;
				System.out.println(ch);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
