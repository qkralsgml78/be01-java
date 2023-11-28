package day07_opp.ex02;

public class progremmers04 {
	public static void main(String[] args) {
		int[][] board = {{0, 1, 2},
						{1, 2, 3},
						{2, 3, 4},
						{3, 4, 5}};
		int k=2;
		
		class Solution{
			public int solution(int[][] board, int k) {
				int sum =0;
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						System.out.println("i+j = "+(i+j));
						int a = i+j;
						
						if(k >= a) {
//							System.out.println(a);
							sum+= a;
						}
					}
					
				}
				System.out.println(sum);
				return sum;
			
			}//solution end
			
		}//Solution C end
		
		
	}
	

}
