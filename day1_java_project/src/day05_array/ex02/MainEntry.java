package day05_array.ex02;

public class MainEntry {
	public static void main(String[] args) {
//		int[][] a=new int[2][3];
		int[][] a = new int[][] {{1,2,3},{4,5,6}}; //초기화 할 때 블럭으로 행을 지정해줘야 함, 블럭 = 행 의미
		
		System.out.println("행의 길이를 구하는 함수"+ a.length);
		System.out.println("열의 길이를 구하는 함수"+a[0].length); //행에서의 열 길이를 구하기에 행을 넣어줘야 함
		System.out.println("열의 길이"+a[1].length);
		
		
		for (int i = 0; i < a.length; i++) { //행
			for (int j = 0; j < 3; j++) { //열
				System.out.print(a[i][j] + "\t");
				
			}// j end
			System.out.println();
		}// i end
	
	}
}



/*
package day05_array.ex02;

public class MainEntry {
	public static void main(String[] args) {
//		int[][] a=new int[2][3];
		int[][] a = new int[][] {{1,2,3},{4,5,6}}; //초기화 할 때 블럭으로 행을 지정해줘야 함, 블럭 = 행 의미
		
		for (int i = 0; i < 2; i++) { //행
			for (int j = 0; j < 3; j++) { //열
				System.out.print(a[i][j] + "\t");
				
			}// j end
			System.out.println();
		}// i end
	
	}
}
*/