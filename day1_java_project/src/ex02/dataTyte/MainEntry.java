package ex02.dataTyte;

public class MainEntry {

	public static void main(String[] args) { //시작점(진입점)
		int su =9;
		char ch ='A'; 
		String str = "korea";
		double d =12.34;
		float f =12.34f; // f, F을 넣으면 float라는 것을 인식
		
		System.out.println(su+","+ch+","+str);
		System.out.println("su ="+su);
		
		System.out.println(100); //int 0 - 4byte // long X
		System.out.println(100); // long - 8byte
		
		System.out.println(3.14); // double
		System.out.println(3.14f); // float
		
		System.out.println(su);
		System.out.println(ch); // 2byte
		System.out.println(str);
		System.out.println(d);
		
		System.out.println();
		int su2=100; //지역변수는 반드시 초기화해서 사용한다.
		System.out.println(su2);
		
		
		
		
	//-------------------------------------------------------------	
		int x  = 2; //기본자료형
		Integer y= 2; //참조형
		x=y; // autoboxing/unboxing
		x=y.intValue();// JDK가 4이하로 내려가면 오류발생하기에 intvalue(형변화함수)를 써줘야 함
		
		String ch1 = "A"; // A\0와 같음
		char ch2 ='A'; // A와 같음
		

	}//end main

}//end class



/*
 * public class MainEntry {
 * 
 * public static void main(String[] args) { //시작점(진입점) // TODO Auto-generated
 * method stub System.out.print("hello java"); System.out.println(100);
 * System.out.print("미니");
 * 
 * }//end main
 * 
 * }//end class
 */

//한줄 주석


/*
 * 여러줄
 * 
 * 주석
 */