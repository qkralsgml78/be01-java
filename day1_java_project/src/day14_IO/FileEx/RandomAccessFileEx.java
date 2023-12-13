package day14_IO.FileEx;

import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws Exception{
		
		RandomAccessFile raf =  new RandomAccessFile("sawon.txt", "rw"); //상대 경로
//		RandomAccessFile raf =  new RandomAccessFile("(경로쓰면됌)sawon.txt", "rw"); //절대 경로 만드는 방법
		
		for (int i = 0; i < 10; i++) {
			raf.seek(i*100); //seek메소드도 예외 발생
			
			raf.writeInt(i);
		}
		
		

		for (int i = 0; i < 10; i++) {
			raf.seek(i*100); //seek메소드도 예외 발생
			//원하는 위치는 seek메소드가 정한다
			raf.writeInt(i);
			System.out.println(raf.readInt());
			System.out.println(raf.readUTF()); //문자
		}
	
		System.out.println("String print Success");
		raf.close();
	}

}
