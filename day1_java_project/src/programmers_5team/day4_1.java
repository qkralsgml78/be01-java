package programmers_5team;

public class day4_1 {
	class Solution {
		private int [][] solution(int n){
			int[][] answer = {};
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(i == j) {
						answer[i][j] = 1;
					}else {
						answer[i][j] = 0;
					}
					 
				}
			}
			
			return answer;
		}
		
		
	}
	
	public static void main(String[] args) {
		int n=3;
		
		System.out.println(); 
		
	}



}
