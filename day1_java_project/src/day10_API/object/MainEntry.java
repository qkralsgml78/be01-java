package day10_API.object;

import javax.swing.plaf.synth.SynthScrollPaneUI;

class Point {   }

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Poinit pt information");
		System.out.println("class name : "+ pt.getClass());
		System.out.println("hash Code : "+pt.hashCode());  //1464642111
		System.out.println("Object String : "+ pt.toString());
		System.out.println("Object String : "+ pt);
		System.out.printf("10진수 %d\n", 0x574caa3f);
		System.out.println("\n=========================\n");
		
		
		Point pt2 = new Point();
		System.out.println("Poinit pt information");
		System.out.println("class name : "+ pt2.getClass());
		System.out.println("hash Code : "+pt2.hashCode());  //509886383
		System.out.println("Object String : "+ pt2.toString()); //1e643faf
		System.out.println("Object String : "+ pt2);
//		System.out.printf("10진수 %d\n", 0x574caa3f);'
		
		System.out.println("pt2.toString() : toString의 의미 - day10_API.object.Point@1e643faf");
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode()));
		
		
		Point pt3 = new Point();
		if(pt.hashCode() == pt3.hashCode()) {
			System.out.println("same");
		}else
			System.out.println("not same");
		
		
		Point pt4;
		pt4 = pt; //new로 만든 것이랑 다름 주소를 주기에 값이 같음
		
		if(pt.hashCode() == pt4.hashCode()) {
			System.out.println("same");
		}else
			System.out.println("not same");
		
		
		System.out.println(pt.hashCode()+", "+pt4.hashCode());
	}

}
