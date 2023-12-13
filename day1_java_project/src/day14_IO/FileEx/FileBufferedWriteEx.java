package day14_IO.FileEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;

public class FileBufferedWriteEx {
	public static void main(String[] args) throws Exception{
		String str, file;
		
		Date date = new Date();
		
		str = "파일 생성 시간 \r\n"+date+"\r\n";
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일 이름 입력 요망 : ");
		
		file = br.readLine();
		System.out.println("저장한 문자열 입력 요망 : ");
		str += br.readLine();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		
		System.out.println(file+"파일을 성공적으로 저장 했습니다.");
		
		//절대 경로를 쓰려면 경로를 그냥 파일 이릅 입력 요망에 쓰면 됌
	}

}
