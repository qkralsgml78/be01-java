package day12_collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//key/ value 한쌍으로 처리. (set+list)
//순서 없음(넣은 순서대로 안나오고 뒤죽박죽 나옴)
//value 값은 중복 O key 중복 X
public class HashMapEx2 {

	static HashMap phoneBook = new HashMap(); //Object type
		
		public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-1234-5678");
		addPhoneNo("친구", "김자바", "011-1224-5638");
		addPhoneNo("친구", "박자바", "010-1111-2222");
		addPhoneNo("회사", "박대리", "010-3333-4444");
		addPhoneNo("회사", "김과장", "010-7777-7777");
		addPhoneNo("회사", "강대리", "010-5555-5555");
		addPhoneNo("세탁", "010-8888-8888");
		
		printAll();
	}
	
	//그룹을 추가하는 메소드
	static void addGroup(String groupName) {
		
		if(!(phoneBook.containsKey(groupName))) {
			phoneBook.put(groupName, new HashMap()); //HashMap안에 또 Map을 만들어서 넣은 구조
		}
	}

	public static void addPhoneNo(String groupName, String name, String tel) { // 계산할 필요없는 것은 문자로 처리하는 것이 편리
		addGroup(groupName);
		
		HashMap group =(HashMap)phoneBook.get(groupName);
		group.put(tel, name); //이름은 중복될 수 있으니 전화번호를 key값으로 설정
		
	}
	
	public static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
		
	}
	
	//전화번호부 전체를 출력하는 메소드
	static void printAll() {
		Set set = phoneBook.entrySet(); //System.out.println(set);
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			
			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name+", "+telNo);
			}//in while end
			System.out.println();
		}//out while end
	}
}
