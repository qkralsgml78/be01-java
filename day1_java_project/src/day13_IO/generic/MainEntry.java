package day13_IO.generic;

import java.awt.Point;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx1<String> t1 = new GenericEx1<String>();
		String[] str = {"abc", "kbs", "diretory"};
		t1.set(str);
		t1.print();
		System.out.println("===================");
		
		GenericEx1<Integer> t2 = new GenericEx1<Integer>();
		Integer[] num = {1,2,3,4,5,6,7,8,9};
		t2.set(num);
		t2.print();
		
		GenericEx1<Double> t3 = new GenericEx1<Double>();
		Double[] num2 = {1.2, 3.2, 5.7, 7.3, 86.3, 99.5};
		t3.set(num2);
		t3.print();
		
		GenericEx1<Object> t4 = new GenericEx1<Object>();
		Object[] obj = {"12.45", new Date(), 47.3, 5.5, "text", new Point()};
		t4.set(obj); t4.print();
		
		
		}
	}

