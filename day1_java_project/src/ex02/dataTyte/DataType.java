package ex02.dataTyte;

public class DataType {
	public static void main(String[] args) {
		 char ch ='A'; //ASCII code
		 
		 System.out.println(ch +", ASCII code ="+(int)ch);
		 System.out.println('B');
		 System.out.println((int)'b');
		 
		 int num =9; // 10진수
		 int xNum =0x9; // 0x숫자: 16진수
		 int oNum =011; // 0숫자: 8진수
		 int bNum = 0B1010;// 0b숫자: 2진수
		 
		 System.out.println("2진수 : "+bNum);
		 System.out.println(num);
		 System.out.println(xNum);
		 System.out.println(oNum);
		 System.out.println("============================");
		 System.out.printf("%d %d \n", 0xa, 0xA);//18 --> 10
		 System.out.printf("%d \n", 012);//8 --> 10
		 
		 System.out.println("------------------------------------------");
		 System.out.printf("%x %X \n", 10, 10);// 16 <--10
		 System.out.printf("%o %O \n", 10, 10);// 8 <-- 10
	}

}
