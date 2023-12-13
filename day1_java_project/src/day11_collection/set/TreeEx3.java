package day11_collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeEx3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "A"; 
		String to = "d";
		
		//대문자 우선순위
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("Car");
		set.add("car");
		set.add("dZZZZZZZZZZ");
		set.add("dzzzzz");
		set.add("abc");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		
		System.out.println(set);// 영문자/대>소>숫자>한글(그외 나라 언어들)
		System.out.println("range search : from "+from +" to "+to);
		System.out.println("result : "+set.subSet(from, to));//a, d 앞에 것 포함, 뒤에 것 미 포함
		System.out.println("result : "+set.subSet(from, to + "zzz")); //뒤에 글자를 포함시키려면 어떤 글자를 포함시킬지 써줘야 함
	}

}
