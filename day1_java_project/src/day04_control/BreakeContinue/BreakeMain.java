package day04_control.BreakeContinue;

import java.util.Iterator;

public class BreakeMain {

	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 1; i <=101; i++) {
			if(i % 2 ==0) {
				cnt++;
				continue;
			}
			System.out.print(i+"\t");
			if(cnt %10 == 0) System.out.println();
		}
		
		
		/*
		label: //예약어 아니고 공백문자 아니고 숫자로 시작하는 것 아니면 다 됌
			//저 멀리 있는 블럭을 빠져나가고 싶으면 이름을 붙여서 빠져나가도록 하면 됌
		for (int i=0; i<6; i++) {
			
			
			for (int j = 1; j < 6; j++) {
				//if(j == 3) break label; //아예 빠져 나감
				if(j == 3) continue label; // 밖에 있는 for문으로 빠져나가서 다시 실행
				System.out.println("i : "+i+", j :"+j);
			}
		}//i end
		*/
	}
}
