//package programmers_5team;
//
//
//class Solution{
//	public int solution(int[] number) {
//		int[] num = new int[number.length];
//		int a=0, b=0, c=0;
//        int answer = 0;
//        
//        for (int i = 0; i < number.length-2; i++) {
//        	num[i] = number[i];
//        	a = num[i];
//        	for (int j = i+1; j < num.length-1; j++) {
//        		b = number[j];
//				for(int k = j+1; k< num.length; k++) {
//					c = number[k];
//					if(a+b+c == 0) {
//						answer++;
//						
//					}
//				}
//			}
//		}
//		return answer;
//	}
//}
//		
//public class D9 {
//	public static void main(String[] args) {
//		int[] number = {-3, -2, -1, 0, 1, 2, 3};
//		
//		Solution s= new Solution();
//		
//		int c = s.solution(number);
//		
//		System.out.println(c);
//	
//        
//	}
//
//}
