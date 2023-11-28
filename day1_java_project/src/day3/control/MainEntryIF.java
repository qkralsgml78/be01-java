package day3.control;

import java.util.Scanner;

public class MainEntryIF {
	public static void main(String[] args) {
			// TODO Auto-generated constructor stub
		
			while(true){
				System.out.println("integer data :");
				int su = new Scanner(System.in).nextInt();
					//짝홀수 판정
					if(su>0){
						System.out.println(su+" ==> 양수임다");
					}else if(su<0){
						System.out.println(su+" ==> 음수임다");
					}else 
						System.out.println(su+": su는 0이다");
		}
			
	}

	}

	/*
	 * int su=11;
	 * 
	 * 
	 * //짝홀수 판정 if(su%2 ==0){ System.out.println(su+" ==> even"); }else { ㅁ
	 * System.out.println(su+" ==> odd"); }
	 */

