package day14_IO.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		try {
//			OutputStream os = new FileOutputStream("memo.txt"); //상대경로, 예외발생함
//			OutputStream os = new FileOutputStream("test.txt"); //절대경로
			OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\OneDrive\\바탕 화면\\수업 정리\\sample.txt");
//			OutputStream os = new FileOutputStream("C:/Users/Playdata/OneDrive/바탕 화면/수업 정리/sample.txt");  //절대 오류 발생하지 않음  /(역슬러시로 경로 넣으면)
			
			
			while(true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine() +"\r\n"; //\r은 키보드 상 home키로 가는 것 \n은 enter를 누른 것과 같아서 둘이 같이 쓰면 엔터치면서 맨 앞으로 이동
				
				if(str.equalsIgnoreCase("EXIT\r\n")){
					System.out.println(str.length() +"byte 만큼 썼습니다.");
					break;
				}
				
				os.write(str.getBytes()); //write 예외 발생 읽어드린 문자 str의 길이(getBytes())만큼 써주세요(try-catch를 써서 오류X)
				System.out.println(str); //화면 출력
			}// while end
			
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
			
		}
	}

}
