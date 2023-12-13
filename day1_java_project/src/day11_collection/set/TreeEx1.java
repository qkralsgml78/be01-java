package day11_collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeEx1 {
	public static void main(String[] args) {
		
		Set set = new TreeSet(); // Tree<Type> 비어있는 그릇을 만듦
		
		for (int i = 0; set.size()<6; i++) {
			
			int num = (int) ((Math.random()*45)+1); //큰애가 작은애로 들어갈 때 꼭 명시적 형변환
			
			set.add(num);
			
		}
		
		System.out.println(set);
		
	}

}
