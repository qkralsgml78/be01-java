package day05_random;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int random = rand.nextInt(100)+1;
		int num= 0;
		
		for(int i=1; i<6; i++) {
			System.out.println("랜덤값 맞추기 게임 값을 입력하세요(기회5번):");
			num = sc.nextInt();
			
			if(num == random) {
				System.out.println("정답을 맞추셨습니다!!");
				break;
			}else if((i == 5)&&(num != random)) {
				System.out.println("정답을 못맞추셨습니다.");
			}else if(num > random ) {
				System.out.println("down");
			}else
				System.out.println("up");
			//먼저 체크해야할 것을 생각하고 앞에 배치하기
		}
		
		System.out.println("정답은: "+random);
	}
}
