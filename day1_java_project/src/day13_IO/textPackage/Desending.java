package day13_IO.textPackage;

import java.util.Comparator;

public class Desending implements Comparator {  // 내림차순 처리 할수 있는 클래스 구현함

	@Override
	public int compare(Object o1, Object o2) {// 어떤 타입이든 다 받게 하려고 Object타입으로 선언함 --> compare은 인자값 2개를 받음(타입 상관없음)
		
		if( o1 instanceof Comparable && o2 instanceof Comparable ) { //o1, o2라는 객체가 Comparable클래스로 형변환이 가능하냐?
			Comparable c1  = (Comparable)o1;
			Comparable c2  = (Comparable)o2;
			
			return c1.compareTo(c2) * -1 ;  // -1을 곱해서 기본 정렬 방식을 역으로 출력
			//return c2.compareTo(c1);
		}
		return -1 ;
	}

}
