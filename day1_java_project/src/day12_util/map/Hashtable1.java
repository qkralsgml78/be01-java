package day12_util.map;
import java.util.Hashtable;
import java.util.Enumeration;
class Hashtable1  {
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		
		ht.put("1","가위");
		ht.put("2","바위");
		ht.put("3","보");
		ht.put("4","보");
		
		if(ht.containsKey("1"))// 1이라는 키값있냐
			System.out.println("가위 포함되어 있음");
		if(ht.containsValue("보")) //보라는 Value 값이 있냐
			System.out.println("보는 3번 포함되어 있음");
		
		System.out.println("총 개수는"+ht.size()+" 입니다."); //데이터 수(요소 수)는 size()함수이기에 넣음
		
		ht.remove("1");//키값으로 삭제를 해야 함
		
		Enumeration enu = ht.keys(); //key에 s가 들어가 있으면 열거형 아니면 배열 타입일 것
		while(enu.hasMoreElements()){//다음 요소가 있느냐? 있으면(true) 없으면(false)
			
			Object key = enu.nextElement(); //nextElement는 무조건 Object타입
			
			Object value = ht.get(key); // ht의 key값을 가지고 와서 저장
			
			System.out.println("키 = "+key+"값 "+value);
		}
	}
}
