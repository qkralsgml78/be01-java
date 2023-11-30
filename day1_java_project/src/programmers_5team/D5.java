package programmers_5team;

import java.util.Iterator;

public class D5 {
	public static void main(String[] args) {
	}
	
	class Solution {
		public boolean solution(int x) {
			int b = x;
			boolean answer = true;
			int length = 0, n = 0;
			System.out.println(b);
			
			String n1 = Integer.toString(b);
			int[] str = new int[n1.length()];
			
			
			for (int i = 0; i < str.length; i++) {
				str[i]= n1.charAt(i)-'0';
				n = str[i];
				length +=n;
				System.out.println(length);
			}
			
			if(x%length == 0) {
				answer = true;
			}else
				answer = false;
			
			
			return answer;
		}
	}
}
