package day14_IO.fileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("C:\\Users\\Playdata\\OneDrive\\사진\\스크린샷\\1.png");//절대 경로
		File dist = new File("C:\\BEYOND_SW_th1\\java\\workspace\\be01-java\\day1_java_project\\알고리즘.png"); //exCopy파일 이 생김
		
		FileInputStream  fis = null; //로컬에 있는 pc를 복사하겠다
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dist);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while((c =bis.read())!= -1){// 하나하나 복사한 것
				bos.write((char)c); 
			}
			
			System.out.println("파일 복사 성공!!!");
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("파일 복사 오류 발생!!");
//			e.printStackTrace();
		}
		
		
		
	}

}
