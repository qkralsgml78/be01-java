package day11_collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashsetEx2 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","3","4","4","4"}; //어떤 타입이든 다 받아줌
		
		Set set = new HashSet();
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);//for문을 돌면서 인덱스에 해당하는 애들을 hashSet 그릇에 담는 것
		}
		System.out.println(set);
		//자료형이 다르면 서로 다른 데이터로 인식함 set은 중복이 안되지만 1이 두개 나옴
	}

}
