package day05_random;

import java.util.Random;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		
		System.out.println(Math.random()); //0.0 ~1.0
		
		System.out.println(Math.random()*5); // 0 ~ 4
		
		System.out.println((int)(Math.random() * 5)); // 0 ~ 4
		System.out.println((int)(Math.random() * 5)+1); // 1 ~ 5
		
		for(int i=0; i <5; i++) {
			System.out.println((int)(Math.random()*45)+1 +"\t");
		}
		System.out.println("====================================");
		Random rand = new Random();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(5));
		System.out.println(rand.nextInt(10)+2);
		System.out.println("====================================");
		
		for(int i=1; i<6; i++) {
			System.out.println(rand.nextInt(45)+1+"\t");
		}
		
	}
}
