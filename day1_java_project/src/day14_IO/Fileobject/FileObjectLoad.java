package day14_IO.Fileobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileObjectLoad {
	public static void main(String[] args) throws Exception{
		
		String name, id, pwd, temp, phone;
		int age = 0;
		boolean gender = true;
		name = id =pwd =temp =phone =null;
		
		File f = new File("members.txt");
		FileInputStream fis = null;
		ObjectInputStream bis =null;
		
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);
			
			name= (String)bis.readObject();
			id= (String)bis.readObject();
			pwd= (String)bis.readObject();
			gender= (Boolean)bis.readObject();
			age= (Integer)bis.readObject();
			phone= (String)bis.readObject();
			//파일을 다 save에서 가지고 와서 넣
			
			
			System.out.println("\t\t\t>>회원정보<<\n");
			System.out.println("Name \t\t PWD \t\t Gender\t Age \t PhoneNumber");
			System.out.println();
			System.out.println(name+"\t"+id+"\t"+pwd+"\t");
			if(gender == true) System.out.println("남자");
			else System.out.println("여자");
			System.out.println("\t"+age+"\t"+phone);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			bis.close();
		}
		
	}

}
