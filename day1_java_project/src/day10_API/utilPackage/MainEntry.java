package day10_API.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.YEAR)+"년");
		System.out.println(c.get(Calendar.MONDAY+1)+"월");
		System.out.println(c.get(Calendar.DATE)+"일");
		
		Date d = new Date();
		int h = d.getHours();
		int m = d.getMinutes();
		int s = d.getSeconds();
		System.out.println("현재 시간은 "+h+"시"+m+"분"+s+"초");
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2022, 12, 20, 0, 0);
		
		if(c1.after(c2)) {
			System.out.println("0");
		}else if(c.before(c2)) {
			System.out.println("X");
		}else if(c.equals(c2)){
			System.out.println("=");
		}
		
	}

}
