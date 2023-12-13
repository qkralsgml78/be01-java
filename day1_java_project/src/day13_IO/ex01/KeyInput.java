package day13_IO.ex01;

import java.io.IOException;

public class KeyInput {
	public static void main(String[] args) 
				throws IOException{ // 예외처리 위임
		
		int su =0;
		
		System.out.println("데이터를 입력 끝은 Ctrl + Z 누르세요");
		
		while((su = System.in.read()) != -1) { 
			//in.read()입력이 열리고 반복문 안에서 돌음 -1이 안들어 왔으면 계속 받을 수 있음
			
			System.out.print(su+"\t");
			System.out.print((char)su +"\t");
		}
		System.out.println();
	}

}
