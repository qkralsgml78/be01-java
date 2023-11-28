package day05_array.ex01;

public class MainEntry {
	
	public static void main(String[] args) {
		//1.
		char[] ch; //배열 선언
		ch = new char[4]; // 배열 생성 --> 메모리에 할당
		
		//2.
		char []ch2 = new char[4];//배열 선언 및 생성
		//배열 초기화
		ch2[0] = 'j';
		ch2[1] = 'a';
		ch2[2] = 'v';
		ch2[3] = 'a';
		
		System.out.println(ch2[0]); //j
		System.out.println(ch2[3]); //a
		
		System.out.println("\n\n======================");
		
		for (int  i = 0;  i < 4;  i++) {
			System.out.println("ch2["+i+"] = "+ ch2[i]);
			
		}
		//3.
		char[] ch3 = {'J', 'A', 'V', 'K', 'a', 'p','R', 'Q', 'm'}; //char [] ch3 = new char[6];
		System.out.println("\n\n배열의 길이 :"+ch3.length);
		
		for(int i= 0; i<ch3.length; i++) { // 배열의 길이만큼 다 출력해 줌
			System.out.println("ch2["+i+"] = "+ ch3[i]);
		}
		System.out.println("==================");
		
		String[] str = {"a", "b", "c", "d", "M", "I", "N", "H", "E", "E"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println("str["+i+"] = "+ str[i]);
		}
		
		System.out.println("특정 문자열 출력 : "+str[7]);
		
		char[] ch4 = {};
		char[] ch5 = new char[] {};//
		
	}

}
