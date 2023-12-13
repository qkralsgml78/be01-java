package day10_API.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("사과=5|초코렛=3|샴페인=1","=|", true); 
		//=,| 두개 다 구분자가 됌
		//StringTokenizer은 구분자가 2,3개 들어갈 수 있음
		
		while(st.hasMoreTokens()) { //다음 요수가 있느냐??
			System.out.println(st.nextToken());
				
			String str = st.nextToken();
			
			
			if(str.equals("=")) System.out.println("\t");
			else if(str.equals("|"))System.out.println("\n");
			else System.out.println(str);
		}

	}

}
