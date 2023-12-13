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
public class HashMapEx4 {
	public static void main(String[] args) {
		String[] data = {"A", "k", "A", "K", "d","A", "K", "K", "k","k","k","A"};
		
		HashMap map = new HashMap(); //<TypeParameter> Wrapper class Type으로만 들어감. (기본자료형 int, char 등등)
		//자료형을 잡고 가도 되지만 안잡고 그냥 가고 밑에서 데이터를 넣을 때 자료형을 결정해줌
		
		for (int i = 0; i < data.length; i++) {
			
			if(map.containsKey(data[i] )) {
				Integer value = (Integer)map.get(data[i]); //인덱스 번호들을 value에 넣는데 1로 시작하게끔 +1을 해줌
				
				 map.put(data[i], new Integer(value.intValue()+1)); //중복되는 애들을 숫자로 세워주겠다
			}else {
				map.put(data[i], new Integer(1));
			}//if end
		}// for end
		
		Iterator it = map.entrySet().iterator();
		System.out.println(iint.getClas);
		
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry)it.next();
			int value = ((Integer)e.getValue()).intValue(); //꺼내서 형변환을 했음
			System.out.println(e.getKey()+" : "+printBar('#', value)+" "+value); 
			//getKey :문자 /printBar은 장식을 추가한 것 ('#', value):#을 중복되는 만큼 출력하게 하기 위한 것"":한칸 띄우고 value : 중복되는 결과값 출력
		}
	}

	public static Object printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar); //String(char[] chArr) 이것도 가능
	}
}
