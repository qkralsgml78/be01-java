package day_8;

import java.util.Scanner;

public class Student extends Person{
	private int jumsu;
	
	Scanner sc = new Scanner(System.in);
	
	public Student() {
		super.input();
		
	}
	
	public void input() {
			
		System.out.println(name+"학생의 점수를 입력하세요 = ");  this.jumsu = sc.nextInt();
			
	}
	
	public int getJumsu() {
		return jumsu;
	}
	
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	
	
	public void disp() {
		super.disp();
		System.out.println(name+"학생의 점수 : "+jumsu);
	}

}
