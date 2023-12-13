package programmers_5team;

import java.util.Arrays;

class Solution1 {
    public int solution1(int[] d, int budget) {
        int answer = 0, a=0;
        
        
        Arrays.sort(d);
	        for (int i = 0; i < d.length; i++) {
				a += d[i];
				if(a <= budget) {
					answer++;
				}else break;
					
			}
	        
	        return answer;
    }
}

public class D11 {
	public static void main(String[] args) {
		int[] d = {2,2,3,3};
		
		int budget = 10;
		
		Solution1 s = new Solution1();
		int c= s.solution1(d, budget);
		
		System.out.println("지원 가능한 부서는 "+c);
		
	}

}
