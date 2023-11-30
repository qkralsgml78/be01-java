package day09_interface.ex03;

import day09_abstract.ex02.Shape;
import day09_interface.ex02.IDraw;

public class MultiClass extends Shape implements Test, IDraw {

	String inum = "이순신";
	
	@Override
	public void draw() {
		System.out.println("IDraw Interface method");

	}

	@Override
	public void tshow(String name) {
		System.out.println("test Interface method");
		
	}

	@Override
	public double calc(double x) {
		System.out.println("Shape abstract class");
		return 100;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		
	}

}
