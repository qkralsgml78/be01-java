package programmers_5team;

public class day4 {
	public static void main(String[] args) {
		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n=123;
		
	}
	


	class Solution {
		public int solution(int[] numbers, int n) {
			int answer = 0, sum =0;
			
			for (int i = 0; i < numbers.length; i++) {
				sum +=numbers[i];
				if(sum>= n) {
					answer = sum;
				}
			}
			
			return answer;
			
		}
	}
}