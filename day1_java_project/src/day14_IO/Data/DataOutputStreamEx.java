package day14_IO.Data;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		File file = new File("sample.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);
		dos.writeShort(100);
		dos.writeInt(500);
		dos.writeLong(88888800);
		dos.writeFloat(12.84F);
		dos.writeDouble(8.8);//버퍼 지우기

		//버퍼를 비워라 = 데이터를 다 내보내겠다
		
		System.out.println("sample.txt 파일에"+dos.size()+"byte save");
		dos.close();
	}
}
