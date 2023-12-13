package programmers_5team;


/*
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 
 * 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다. 2,5 최소1, 최대 10
 */

//class Solution {
//    public int[] solution(int n, int m) {
//		int[] answer = new int[2];
//		
//        if(n>m) {
//			int num = n%m;
//			System.out.println(num);
//			
//			if(m%num == 0) {
//				answer[0] =num;
//				
//			}
//            
//			answer[1] = (n*m)/num;
//            
//            return answer;
//		}else if(m>n) {
//			int num = m%n;
//            
//			System.out.println(num);
//			
//			if(n%num == 0) {
//				answer[0] =num;
//			}
//			
//			answer[1] = (n*m)/num;
//            
//            return answer;
//		}
//    }
//}


public class D13 {
	public static void main(String[] args) {
		int n = 2;
		int m = 5;
		int temp = 0;
		int[] answer = new int[2];
		
		if(n == 0){
            answer[0] = m;
            answer[1] = m/answer[0];
        }else if(m==0) {
        	answer[0] = n;
			answer[1] = n/answer[1];
        }
		
		if(n>m) {
			
			if(n%m == 0) {
				temp = m;
			}else temp = m%n;
			
			if(m%temp == 0) {
				answer[0] =temp;
				
			}
			answer[1] = (n*m)/answer[0];
			
		}else if(m>n) {
			
			
			if(m%n == 0) {
				temp =n;
			}else temp = m%n;
			
			if(m%temp ==0) {
				answer[0] = temp;
			}
			
			System.out.println(temp);
			
			answer[1] = (n*m)/answer[0];
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
			
		}
		
		
	}

}
