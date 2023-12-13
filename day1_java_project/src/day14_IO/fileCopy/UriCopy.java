package day14_IO.fileCopy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
	public static void main(String[] args) 
			throws MalformedURLException, IOException { //예외도 여러가지 연결 가능
		URL url = new URL("https://i.namu.wiki/i/2L-a7x8akMtjyGJIOYmCbh4ge-wql_rPchPWTPjWdzjqWOcVX12HvF5gzvuzDFY5rp02n42-042eWl13xGK-c6huRgQxr0OkZ80XZ78X1cwF1_ulLDgGkYk7Jal6eNZWEFAtxvNJj_nZgNXwUIY9SA.svg");
		
		//읽기 객체 -fileInputStream
		InputStream is =url.openStream(); //통로연결
		
		//쓰기 객체 - fileOutputStream
		OutputStream os = new FileOutputStream("google.jpg");
		
		byte[] buffer = new byte[1024*8];
		
		while(true) {
			int inputData = is.read(buffer);
			if(inputData ==-1)break;
			os.write(buffer, 0, inputData);
		}
		
		is.close(); os.close();
		System.out.println("웹에서 파일 복사했습니다.");
		
		
	}

}
