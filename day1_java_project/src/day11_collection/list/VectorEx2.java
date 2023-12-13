package day11_collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector();
//		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length       /     capacity");
		System.out.println(v.size()+ "           /          "+v.capacity());//요소는 안 넣어서 0, 초기 용량은 10
		
		Vector<Integer> v2 = new Vector(3, 4);//초기용량 , 증가용량  ---> 초기 용량을 잡아놨는데 증가용량도 잡아놨다 그러면 용량이 부족하면 증가용량만큼 늘어난다.
		//배열은 공간이 하나라도 부족하면 자기의 용량을 똑같이 복사해서 증가시킨다. 용량 6----> 용량 12로 증가
		v2.add(20);
		v2.add(12);
		v2.add(38);
		v2.add(99);
		v2.add(12);
		System.out.println(v2.size()+ "           /          "+v2.capacity());
		
		System.out.println("------iterator() Method---------------");
		Iterator it = v2.iterator(); //iterator은 하나씩 요소를 꺼내서 넣는 함수
		while(it.hasNext() ) {
			System.out.print(it.next() + "\t");
		}
		
		System.out.print("\n------get() Method-------------------\n");
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i)+"\t");
			
		}
		
		System.out.println("\n------elementsAt() Method------------");
		for (int i = 0; i < v2.size(); i++) { // Vector에 있는 모든 요소에 대해 반복
//			System.out.println(v2.get(i)+"\t");
			
			Integer num = v2.elementAt(i);
			System.out.print(num+"\t");
		
			
		}
		System.out.println("\n\n"+v2.size()+"            /             "+v2.capacity());
		v2.trimToSize();// capacity사이즈 재조정
		System.out.println("\n\n"+v2.size()+"            /             "+v2.capacity());
	}


}
