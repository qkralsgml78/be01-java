package day_8;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Person p = new Person();
		//p.disp();
		
		Student s;// 학생클래스 객체 선언
		
		
		Scanner sc = new Scanner(System.in);
		int a =0;
		
		System.out.println("1.Person\n2.Student = ");
		a= sc.nextInt();
		
		switch(a) {
		case 1:
			p.input();
			p.disp();
			break;
			
		case 2:
			s = new Student(); //여기에서 객체를 만들어줌 위에서 객체를 선언만 해줬기 때문에
			s.input();
			s.disp();
			break;
		}
		
		
	} // main m end
} // MainEntry class end