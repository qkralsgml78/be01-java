package day05_array.ex01;

import java.util.Scanner;

public class ScoreArrayEx1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int INWON = 2, su = 3;
		String[] name = new String[INWON]; // 
		int[] subject = new int[su]; //과목 수 
		int[][] uUserInfo = {{80, 90, 84}, {72, 49, 98}}; // 총점, 평균 구하기
		int[] avg = new int[INWON];
		int hap = 0;
		
		
//		String name  = sc.next(); //문자열이 들어옴
		for (int i = 0; i < uUserInfo.length; i++) {
			System.out.println("name = ");
			name[i] = sc.nextLine();
			System.out.println("과목 수를 입력 : ");
			subject[i] = sc.nextInt();
			System.out.println(subject[i]);
			for (int j = 0; j < uUserInfo[i].length; j++) {
				hap += uUserInfo[i][j];
			}
			
			
		}
		
		
	}

}

/*
Scanner sc= new Scanner(System.in);
int INWON = 3;
int[] kor = new int[INWON];
int[] eng = new int[INWON];
int[] com = new int[INWON];
int tot[] = new int[INWON];
double[] avg = new double[INWON];


//String name  = sc.next(); //문자열이 들어옴
String[][] name = new String[INWON][100];
int hap = 0; 
double sum = 0;

for (int i = 0; i < INWON; i++) {
	System.out.println("name = ");
	name[i][100] = sc.next();
	
	System.out.println("국어, 영어, 수학 성적을 입력 : ");
	kor[i] = sc.nextInt();
//	eng[i] = sc.nextInt();
//	com[i] = sc.nextInt();
}
for(int item: kor) {
	hap +=item;
}
//for(int item: eng) {
//	hap += item;
//}
//for(int item: com) {
//	hap +=item;
//}
sum = (double)hap/name.length;
for (int i = 0; i < INWON; i++) {
	System.out.println(name[i][100]+"의 성적표*********");
	System.out.println("국어: "+kor[i]+" 영어: "+eng[i]+" 수학 :"+kor[i]);
	System.out.printf("총점: %d  평균: %.2f", hap, sum);
}
*/
