package programmers_5team;

import java.util.ArrayList;

//class Solution{
//    public int[] solution(int []arr) {
//       
//        return answer;
//    }	
//}


public class D8 {
	public static void main(String[] args) {
		 int[]arr = {1,1,3,3,0,1,1};
//		 [4,4,4,3,3]
		 int[] answer = {};
		 ArrayList<Integer> ar = new ArrayList();
	        
	        for (int i = 0; i < arr.length-1; i++) {
	        	if(arr[i] != arr[i+1]) ar.add(arr[i]);
	        	if(i ==arr.length-2) ar.add(arr[arr.length-1]);
	        	
	        	
	        	System.out.println(ar);
	        		
			}
	        answer = new int[ar.size()];
	        for (int j = 0; j < ar.size(); j++) {
				answer[j] = ar.get(j);
	     }
	        
	        
	}
	
}

