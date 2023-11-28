package day02.operator;
//최단산쉬관논삼대콤
public class OperatorTest2 {
	public static void main(String[] args) {
		//대입(배정)연산자: =, +=, -=, *=, /=, %=, >>=, <<=,....
		
		int x=3, y=5, result;
		result=x+y;
		System.out.println(result);
		
		x+=y;
		x*=y;
		
		System.out.println("x= "+x+"\ny= "+y);
		
		x=x+1;
		x+=1;
		x++;
		
	}

}


/*
 * package day02.operator;
 * 
 * public class OperatorTest2 { public static void main(String[] args) {
 * //삼항연산자(조건연산자): (조건) ? 참:거짓; 
 * int x=20, y=10; String 
 * msg=null; // msg="";
 * 
 * msg = (x!=y)? "not same":"same";
 * 
 * System.out.println(msg);
 * 
 * int a=10, b=20, c=30, d=40, result;
 * 
 * result= (a > b) ? a : (b > c) ? b : c;
 * 
 * System.out.println(result);
 * 
 * result= (a > b) ? a : (b > c) ? b : (c > d) ? c : d; }
 * 
 * }
 */