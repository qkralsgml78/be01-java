package quiz_Video.map;

import java.util.Scanner;

public class VideoMain {
	static String title, category, lend, lendName, lendData;
	
	public static void menu() {
		System.out.println("\n\n*-*-*-*-* 메뉴 *-*-*-*-*");
		System.out.println("1. 고객 정보 입력");
		System.out.println("2. 고객 정보 삭제");
		System.out.println("3. 고객 정보 수정");
		System.out.println("4. 모든 고객 보기");
		System.out.println("5. 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	}
	
	public static void main(String[] args) {
		VideoSub vs = new VideoSub();
		
		Scanner sc = new Scanner(System.in);
		
//		try {
//			while(true) {
////				menu();
//				int inNum = sc.nextInt();
				
//				try {
//					switch(inNum) {
//					case 1:
//						System.out.println("\n*-*-*-* 1. 고객 정보 입력 *-*-*-*");
//						inVideo();
//						vs.Videoadd()
//					}
//				}
//				
//			}
//		}
		
		
	}//main end
	
	public static void inVideo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비디오제목 >> ");
		title = sc.next();
		System.out.print("비디오 장르 >> ");
		category = sc.next();
		System.out.print("대여여부  >> ");
		lend = sc.next();
		System.out.print("대여자(고객명)  >> ");
		lendName = sc.next();
		System.out.print("대여일자  >> ");
		lendData = sc.next();
	}
	

}//class end
