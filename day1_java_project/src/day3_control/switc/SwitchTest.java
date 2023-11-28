package day3_control.switc;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("input jumsu(k,e,c) : ");
		
		Scanner sc = new Scanner(System.in);
		
		int total = (sc.nextInt()+ sc.nextInt()+ sc.nextInt());
		double avg = (double)total/3;
		char grade;
		
		/*switch(total/30) {
		case 10: grade ='A'; break;
		case 9: grade = 'B'; break;
		case 8: grade = 'C'; break;
		default: grade = 'F'; break;
		}*/
		switch((int)avg/10) {
		case 10: grade ='A'; break;
		case 9: grade = 'B'; break;
		case 8: grade = 'C'; break;
		case 7: grade = 'D'; break;
		default: grade = 'F'; break;
		}
		System.out.println("\n\n"+total+"===>"+grade+"학점");
	}

}
