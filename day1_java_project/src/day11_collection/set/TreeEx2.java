package day11_collection.set;

import java.util.TreeSet;

public class TreeEx2 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(); // Tree<Type> 비어있는 그릇을 만듦
		int[] score = {85, 95, 35, 84, 36, 100};
		
		for (int i = 0; i < score.length; i++) {// for문을 통해 데이터 삽입
			set.add(new Integer(score[i])); //숫자 형태로 바꿔서 넣음
//			set.add(score[i]);
		}
		System.out.println(set);
		
		//자동 정렬, 중복 허용X
		//로또 프로그램에 쓰기 좋음
		
		System.out.println("50보다 작은 값: "+set.headSet(new Integer(50))); //50보다 작은 데이터 출력(headSet Method)
		System.out.println("50보다 큰 값 : "+set.tailSet(50)); //50보다 큰 값 데이터 출력(tailSet Method)
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		
	}

}
