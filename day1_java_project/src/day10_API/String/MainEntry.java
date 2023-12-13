package day10_API.String;

class Point {  }

public class MainEntry {
	public static void main(String[] args) {
		String  str = "abc";
		System.out.println();
		char ch =str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2));
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str :"+str);
		System.out.println("kbs");
		
		String msg = "qkralsgml98";
		System.out.println("en-core"+msg);
		System.out.println(msg);
		
		String str2 = "abcde".substring(2); //중간값 출력 
		System.out.println(str2);//cde
		
		str2 = "abcdefghijklmn".substring(2,5); //시작값 포함 끝 값 미포함
		System.out.println(str2);
		
		System.out.println(msg+" : "+str2);
		
		String s1 = new String("encore");
		String s2 = new String("encore");
		System.out.println("s1.hashCode : "+s1.hashCode());
		System.out.println("s2.haseCode : "+s2.hashCode());
		
		Point p = new Point();
		Point p2 = new Point();
		System.out.println("p.hashCode : "+p.hashCode());
		System.out.println("p2.hashCode : "+p2.hashCode());
		
		String s3 = "seoul";
		String s4 = "seoul"; 
		
		//= stack영역의 값을 물어보는 것
		if(s3 == s4) System.out.println("same");
		else System.out.println("not same");
		System.out.println("======================");
		
		//heap영역의 값을 물어보려면 equals로 물어봐야 함
		if(s1 == s2) System.out.println("same");
		else System.out.println("not same");
		
		s2 = "kosa";
		System.out.println("s1.hashCode : "+s1.hashCode());
		System.out.println("s2.haseCode : "+s2.hashCode());
		
		s2 = "korea";
		System.out.println("s1.hashCode : "+s1.hashCode());
		System.out.println("s2.haseCode : "+s2.hashCode());
		
		s2 = "encore";
		System.out.println("s1.hashCode : "+s1.hashCode());
		System.out.println("s2.haseCode : "+s2.hashCode());
		
		
	}

}
