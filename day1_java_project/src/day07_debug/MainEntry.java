package day07_debug;

public class MainEntry {

	public static void main(String[] args) {
		//디버깅 방법
		//단계단계 확인할 때 유용함 다 실행하는 것이 아니라 point를 지정해서 그 부분을 단계적으로 실행시킴
		int x=5, y=0;
		int i;
		
		for (i = 1; i < 6; i++) {
			y += x*i;
		}
		for (i = 0; i < 100; i++) {
			if(i == 30) 
				break;
				System.out.println(i);
		}
		System.out.println(x+", "+y+", "+i);
	}
}
