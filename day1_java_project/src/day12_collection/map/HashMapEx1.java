package day12_collection.map;

import java.util.HashMap;
import java.util.Scanner;

//key/ value 한쌍으로 처리. (set+list)
//순서 없음(넣은 순서대로 안나오고 뒤죽박죽 나옴)
//value 값은 중복 O key 중복 X
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		int count = 0;
		
		map.put("encore", "1234");
		map.put("kosa", "1111");
		map.put("minhee", "1234");
		map.put("encore", "1983");

		
		System.out.println(map);
		System.out.println("요소개수 : "+map.size()); //key 중복허용 안됌
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력해주세요 : ");
			System.out.println("id : ");
			String id =sc.nextLine().trim();
			System.out.println("Pw : ");
			String pwd =sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}else {
				if(!(map.get(id).equals(pwd))) {// id와 같은 value값을 가져와서 key에 해당하는 value값이 아니다 그러면 밑에 출력
					
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
					
				}else {
//					System.out.println("id와 password가 일치합니다.");
					System.out.println(id+"님 반갑습니다.");
					break;
				}
			}
		}
	}
}
