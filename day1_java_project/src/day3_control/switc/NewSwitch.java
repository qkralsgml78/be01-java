package day3_control.switc;

import java.util.Scanner;

public class NewSwitch {

	public static void main(String[] args) {
		int month = new Scanner(System.in).nextInt();
		int day = 0;
		String result = null;
		boolean flag = false;
		
		
		/*
		 day = switch(month) {
			case 1,3,5,7,8,10,12 ->{
				System.out.println("31일까지 있습니다.");
				yield 31;
			}
			case 4,6,9,11 ->{
				System.out.println("30일까지 있습니다.");
				yield 30;
			}
			case 2 ->{
				System.out.println("28일까지 있습니다.");
				yield 28;
			}
			default ->{
				System.out.println("없는 달입니다. 1~12까지만 입려하세요.");
				yield 0;
			}
		};
		*/
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
		case 4: case 6: case 9: case 11: day =30; break;
		case 2: day =28; break;
		default : System.out.println("없는 달입니다. 1~12월까지 입력하세요.");
		}
		
		
	}
}
