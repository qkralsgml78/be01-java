package day3.control;

import java.util.Scanner;

public class QuizIF {
	public static void main(String[] args) {
		System.out.println("year: ");
		int year = new Scanner(System.in).nextInt();
		String result = null;
		boolean flag = false;
		
		if(year %4 == 0) {
			if(year % 100 != 0 || year %400 ==0) {
				flag =true;
			}
		}
		
		result = (flag == true) ? "윤년":"평년";
		System.out.println(result);
	}

}
