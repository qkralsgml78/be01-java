package day11_collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {

		int i;
		Date date = new Date();
		Vector v= new Vector(3, 5); //초기 용량, 증가 용량
		
		v.addElement("자바");
		v.addElement(new Double(12.34));
		v.addElement(date);
		
		System.out.println("-----------3개 객체 추가---------");
		System.out.println("size : "+v.size()+", capacity: "+v.capacity());
		
		for (i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
		
		System.out.println("---------10개 객체 추가----------");
		System.out.println("size : "+v.size()+", capacity: "+v.capacity());
		
		System.out.println("----------Vector 내용 출력-------------");
		Enumeration enu = v.elements(); //복수개의 요소를 꺼내서 Enumeration타입의 enu에 넣겠다
		
		while(enu.hasMoreElements() ) {
			System.out.print(enu.nextElement()+"\t");//데이터를 다 꺼내 오는 것
		}
		System.out.println("\n\n--------------객체 내용 포함 확인---------");
		if(v.contains("자바")) System.out.println("자바 문자열 포함되어 있음");
		else System.out.println("해당 요소 없음");
		
		
		System.out.println("12.34 객체 위치는 ?"+v.indexOf(new Double(12.34))); // Double타입의 12.34 어디 있니
//		System.out.println("12.34 객체 위치는 ?"+v.indexOf(12.34)); 이렇게 넣어도 가능
		
		System.out.println("입력 시간은? "+date);
		
		v.get(v.indexOf(date));//v의 인덱스 번호를 꺼내와 , get은 요소를 꺼내오는 것 indexOf는 인덱스의 갯수
//		System.out.println(v.get(v.indexOf(date))); //꺼내오면서 바로 출력 가능
		
		//date 객체 삭제
		v.removeElementAt(v.lastIndexOf(date)); // 뒤에서부터 날짜를 찾아서 삭제
		System.out.println("size : "+v.size()+", capacity: "+v.capacity());//위에서 요소를 하나 삭제해서 size가 하나 작아짐
		System.out.println("############################");
		
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement()+"\t"); //날짜 없어진 것 확인
			
		}
		System.out.println("\n##############################");
		
		for (i = 0;  i< v.size(); i++) {
			v.removeElementAt(i);//하나씩 요소를 지워나가는 것
			
		}
		System.out.println("\n##############################");
		System.out.println("size : "+v.size()+", capacity: "+v.capacity());
		
		
		System.out.println("============삭제 후 남은 갯수==============");
		for (i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+", ");//자료 구조는 index[0]번째가 사라지면 요소가 앞으로 땡겨져서 index[1]번째---->0번째로 들어가고 index[2]번째는 ---->1로 
			//땡겨지면서 2번째였던 index요소가 삭제가 된다. 이게 계속 반복
			
		}
		
		System.out.println("\n\n**********************************");
		v.setElementAt("java", 2);//2번째가 아니라 3번째 위치에 문자열 java 추가
		
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement()+"\t");
		}
		
		System.out.println("\n\n*********************************");
		v.removeAllElements();//모든 요소 제거 ---->size가 0으로 변함(요소를 다 삭제), capacity는 사이즈 안변함
		System.out.println("size : "+v.size()+", capacity: "+v.capacity());
		
		
		v.trimToSize();//capacity 사이즈에 맞게 재조정  ---> size 0이니 그것에 맞게 capacity도 조정
		System.out.println("size : "+v.size()+", capacity: "+v.capacity());
	}


}
