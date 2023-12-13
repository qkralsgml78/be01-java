package programmers_5team;

class Solution {
    public int solution(String s) {
    	int answer = 0;
        String[] str = new String[s.length()];
        String[][] num = {{"0","zero"},
		        		{"1","one"},
		        		{"2","two"},
		        		{"3","three"},
		        		{"4","four"},
		        		{"5","five"},
		        		{"6","six"},
		        		{"7","seven"},
		        		{"8","eight"},
		        		{"9","nine"}};
        
        
     
        for (int i = 0; i < num.length; i++) {
        		s = s.replace(num[i][1], num[i][0]);
				
		}answer = Integer.parseInt(s);
		
        return answer;
    }
}

public class D7 {
	public static void main(String[] args) {
		String s ="one4seveneight";
		
		Solution S = new Solution(); //class 객체 생성
		
		int c = S.solution(s); //class에서 값을 가져올 변수를 만들고 저장
		System.out.println("result 값은 = "+c); // 출력
	
		
	}

}
