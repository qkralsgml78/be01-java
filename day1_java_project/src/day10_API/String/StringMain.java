package day10_API.String;

public class StringMain {
	public static void main(String[] args) {
		String s1 ="jdlkfiewdi";
		String s2 = "MINHEE";
		
		System.out.println("s1 = "+s1+"\ns2 = "+s2);
		System.out.println(s1.concat(s2)); //문자열 결합
		System.out.println(s1+s2); // ==concat
		System.out.println(s2.replace("IN", "korea"));
		System.out.println("s1 = "+s1+"\ns2 = "+s2);
		s2 =s2.replace("IN", "Korea");
		System.out.println("s1 = "+s1+"\ns2 = "+s2);
		
		String s3 = new String("    ab    cd    ");
		System.out.println(s3);
		System.out.println("length = "+s3.length());//문자열 출력
		s3 = s3.trim();//공백제거
		System.out.println("length = "+s3.length());
		System.out.println(s3);
	 	
		
		int[] a = {1,2,3,4,5};
		for (int i = 0; i < a.length; i++) {
			
		}
		
//		String s4 = new String("abc defgh k234453 keike hdis");
		String s4 = new String("abc/defgh/k234453/keike/hdis");
//		String[] s5 = s4.split(" "); //구분자가 공백
		String[] s5 = s4.split("/"); //구분자가 /
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된"+ i +"번째 문자열 : "+s5[i]);
		}
		
		String s6 = "123-456-789";
		s5 = s6.split("-");
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		
		String s7 = "1234567890abcdef   83628 f932984f8f7f73 Stirng";
		char ch = s7.charAt(15);
		System.out.println(ch);
		System.out.println(s7.indexOf('f'));
		System.out.println(s7.lastIndexOf('f'));//36 공백 포함해서 마지막에 있는 f위치를 출력
		
		System.out.println(s7.substring(3));//3번 인덱스부터 끝까지 출력
		System.out.println(s7.substring(5,7));
		
		System.out.println(s2 + "소문자 출력 toLowerCase() : "+s2.toLowerCase());
		System.out.println(s2 + "대문자 출력 toUpperCase() : "+s1.toUpperCase());
	}

}
