package day02.operator;

public class Quiz01 {
	public static void main(String[] args) {
		int pay = 567890;
		
		int result1 = pay/10000;
		int na1 =pay%10000;
		int result2 = (pay-na1)/1000; //int result2 = (pay-(result1*10000))/1000;
		int na2 = pay%1000;
		int result3 = (pay-na2)/100; //int result3 = (pay-((result1*10000)+(result2*1000)))/100;
		int na3= pay%100;
		int result4 = (pay -na3)/10; //int result4 = (pay -((result1*10000)+(result2*1000)+(result3*100)))/10;
		
		//result1*10000 = result1%10000
		
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	
		//Quiz 2 시간 구하는 퀴즈
		int su= 12345;
		
		int time = 12345/3600;
		su = su%3600;
		int time2 = su/60;
		int time3= su%60;
		
		System.out.println(time+"시 "+time2+"분 "+time3+"초");
		
		
		
	}
	

}
