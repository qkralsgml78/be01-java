package day14_IO.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws IOException{ //예외처리 위임
		//읽기 객체 - fileInputStream
		
		InputStream is = new FileInputStream("알고리즘.png");
		
		
		//쓰기 객체 - fileOutputStream
		OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\OneDrive\\바탕 화면\\suji.png");
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		//byte단위로 사진을 하나한 뜯어서 복사를 했기 때문에 시간이 오래 걸린 것
		is.close();
		os.close();
		
		System.out.println("copy success");
	}

}
