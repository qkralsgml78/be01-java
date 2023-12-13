package day12_collection.map;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("zz", 1000);
		tm.put("bb", 1000);
		tm.put("aa", 1000);
		tm.put("dd", 1000);
		
		System.out.println("value : "+tm.get("aa"));
		System.out.println(tm); //자동정렬된다.(key 값)
		
		TreeSet set = new TreeSet();
		
		System.out.println((int)(Math.random()*50)+1);
		
		for (int i = 0; i < 6; i++) {
			int num = ((int)(Math.random()*50)+1);
			set.add(num);
		}
		List list = new LinkedList(set); //set을 LinkedList 타입으로 바꾼 것
		
		
		System.out.println(set);
		
	}

}
