package day14_IO.Data;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File file = new File("sample.txt");
		
		FileInputStream fis = new FileInputStream(file); //파일을 입력하는 역할
		DataInputStream dis = new DataInputStream(fis); //파일을 출력하는 역할
		
		System.out.println(dis.readBoolean()); //Boolean타입으로 읽어서 출력
		System.out.println(dis.readChar()); //char타입으로 읽어서 출력
		System.out.println(dis.readShort()); //Short타입으로 읽어서 출력
		System.out.println(dis.readInt()); //
		System.out.println(dis.readDouble());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		
		dis.close();
		
	}

}
