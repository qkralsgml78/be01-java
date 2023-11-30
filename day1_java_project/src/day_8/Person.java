package day_8;

import java.util.Scanner;

public class Person {
	
	protected String name, gender;
	protected int age;
	
	Scanner sc = new Scanner(System.in); 
	
	public Person() {
		//input();
	}
	
	public void input() {
		
		System.out.println("이름 = ");  this.name = sc.next();
		System.out.println("성별 = ");  this.gender = sc.next();
		System.out.println("나이 = ");  this.age = sc.nextInt();
		
	}
	
	public Person(String name, String gender, int age) {
		super();
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		
	}
	
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	public void disp() {
		System.out.print("학생이름 : "+name+" 성별 : "+gender+" 나이 : "+age+"\n");
	}
	
	

}
