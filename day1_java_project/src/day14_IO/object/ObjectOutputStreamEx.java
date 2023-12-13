package day14_IO.object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx{
	public static void main(String[] args) throws Exception{
		
		Grade vo = new Grade();
		vo.setSubject("미술");
		vo.setScore(80);
		
		vo.setSubject("전산");
		vo.setScore(93);
		
		System.out.println(vo); //화면출력
		
		OutputStream os = new FileOutputStream("grade.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		System.out.println("파일이 저장되었습니다.");
		oos.writeObject(vo);//객체로 저장(지정한 파일 grade.dat안에 쓴다)
		oos.close();
	}

}
