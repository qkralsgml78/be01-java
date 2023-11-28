package day02.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리연산자:&(and) |(or), ^(xor) 2진논리 숫자로 돌려줌
		//논리연산자:&&(and) ||(or), ^(xor) 10진논리
		//1. 2진 연산
		/*
		  int x=4, y=7;
		 
		  System.out.println(x & y);
		  System.out.println(x | y);
		  System.out.println(x ^y);
		 */	
		
		int x=10, y=20, z=30;
		boolean result =true;
		
		result =(x>y) && (z>y);//'&&'연산은 앞에 것이 '거짓'이면 뒤는 수행X
		System.out.println("&& = "+result);
		
		result =(x>y) && (z>y);
		System.out.println("&& = "+result);
		
		result =(x>y) || (z>y);
		System.out.println("&& = "+result);//'||'연산은 앞에 것이 '참'이면 뒤는 수행X
		
		System.out.println("! = " +!result);
	}

}


/*
* package ex01.operator; //최단산쉬관논삼대콤 public class MainEntry { public static
* void main(String[] args) { // TODO Auto-generated method stub 
단항연산자: 항이 1개인 것을 얘기함, 증감=> ++, --, ~,..... 
* 
* int x=10; int y;
* 
* y=x++; //후위연산: 대입을 먼저, 연산 나중 
* y=++x;//전위연산:연산먼저, 대입나중 y=x--;
* 
* 
비트 연산자
* int x= -10, y;
		
		y=~x; //비트부정  -(원래 값 +1) ==>결과
		
		
		System.out.println(y);
* 
* System.out.println("x = "+x+",y= "+y);
* 
* 
* 
산술연산자: +,-,*,/,%,....
		int x= 10,  y=20;
		int gob=x*y;
		
		System.out.println("x * y ="+gob);
		System.out.println(gob);
		System.out.println("\n\n 3+4*5= "+(3+4*5));
		System.out.println("\n\n 3+4*5= "+(3+4)*5);
		
		//정수 (+,-,*,/,%,...) 정수=정수
		
		System.out.println("\n 7/3= "+(7/3)); //결과 2, 몫
		System.out.println("7%3= "+(7%3)); //결과 1, 나머지
		
		System.out.println("\n 7/3= "+(7/3.)); //결과 2, 몫
		System.out.println("7%3= "+(7%3.)); //결과 1, 몫
		
		
shift연산자: <<,>>,>>>
		int x=8, result;
		
		result = x << 2; // left shift: 원래값 *2^ bit수
		//result = x >> 3; // right shift: 원래값 /2^ bit수 
		
		System.out.println("left shift :"+result);
		System.out.println("right shift :"+result);
		
		//관계연산자: >,<,>=,<=, == , !=(if문이랑 가장 많이 쓰임)
		int x=3; 
		int y=5;
		
		boolean flag = true;
		
		System.out.println(!flag);
		
		if(x>y) {
			System.out.println("max: "+x);
		}else {
			System.out.println("max: "+y);
		}
* 
* }
* 
* }
*/