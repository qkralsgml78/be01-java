package day11_collection.set;

import java.util.HashSet;
import java.util.Iterator;
//set
//순서 없고 중복 안됌

public class HashsetEx01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>(); //new HashSet<>(); 앞에 타입을 쓰면 <> 안써도 됌
		hs.add("키보드");
		hs.add("컵");
		hs.add("마우스");
		hs.add("텀블러");
		hs.add("볼펜");
		hs.add("볼펜");// 중복 허용 X
		//요소의 개수를 세주거나 데이터 몇개인지 알 수 있는 함수는 Size()
		
		
		System.out.println("요소 개수 : "+hs.size());
		//데이터 꺼내는 함수가 자체로 가지고 있지 않아서 Iterator 함수의 도움을 받음
		Iterator it = hs.iterator();
		
		while(it.hasNext()){// 다음 요소가 있냐(다음 데이터가 있냐)
			System.out.println(it.next());
		}
		
//		HashSet<int> hs2 = new HashSet<String>();//뒤에 타입이 안맞아도 error, <>안에 wapper타입이 들어가야 함
		HashSet<Integer> hs2 = new HashSet<>();//뒤에 타입이 안맞아서 error
		hs2.add(200);
		hs2.add(232);
		hs2.add(10);
		hs2.add(84);
		
		System.out.println("------------------");
		for(Integer item: hs2) {
			System.out.println(item);
		}
		
		System.out.println("------------------");
		for(String item: hs) {
			System.out.println(item);
		}
		
		System.out.println("------------------");
		for(Object item: hs2) {
			System.out.println(item);
		}
		
		System.out.println("------------------");
		it = hs.iterator(); //요소를 꺼내서 it에 넣어주는 method(iterator)
		while(it.hasNext()) {//다음 요소가 있다면 꺼내주고 없다면 false
			System.out.println(it.next()); // 요소를 꺼내와서 출력
		}
		
		
	}

}
