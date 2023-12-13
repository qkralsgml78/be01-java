package day12_collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//key/ value 한쌍으로 처리. (set+list)
//순서 없음(넣은 순서대로 안나오고 뒤죽박죽 나옴)
//value 값은 중복 O key 중복 X
public class HashMapEx3 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		
		map.put("연아", new Integer(90)); //integer 안쓰고 넣어도 됌
		map.put("단아", 60);
		map.put("동혁", 80); 
		map.put("승민", 38);
		map.put("민희", 74);
		
		Set set = map.entrySet();	System.out.println(set); //set은 한쌍을 배열로 넣어서 출력해줌
		// set은 key, value값을 따로 출력할 수 ㅣㅇㅆ음
		Iterator it = set.iterator();	System.out.println(it.next());
		
//		Set set = (Set) map.entrySet().iterator();
		
		System.out.println("------------Iterator-------------");
		while(it.hasNext()) { //다음 요소가 있냐
			Map.Entry e = (Entry) it.next();//그럼 요소 출력
			System.out.println("Name : "+e.getKey()+", Score : "+e.getValue());
		}
		
		set= map.keySet();
		System.out.println("참가자 명단 : "+set);
				
		Collection values = map.values();
		it= values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)(total/set.size()));
		System.out.println("최고 점수 : "+Collections.max(values));
		System.out.println("최하 점수 : "+Collections.min(values));
		
				
		
		
		
	}
}
