package day12_util.set;
import java.util.*;

class HashSetEx5 {
	public static void main(String args[]) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();//A,B 교집합
		HashSet setCha = new HashSet();//A,B A입장에서 B를 싹뺀 것 아니면 B입장에서 A부분을 싹 뺀 것

		setA.add("1");		setA.add("2");
		setA.add("3");		setA.add("4");
		setA.add("5");
		System.out.println("A = "+setA);

		setB.add("4");		setB.add("5");
		setB.add("6");		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);

		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}

		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}

		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());

		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());


		System.out.println("A ∩ B = "+setKyo);  //A와 B의 
		System.out.println("A ∪ B = "+setHab); // A, B의 합집합 문자열
		System.out.println("A - B = "+setCha); 
	}
}