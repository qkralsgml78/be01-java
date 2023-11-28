package day04_control.BreakeContinue;

import java.util.Scanner;

public class QuizBreake {
	public static void main(String[] args) {
		//과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
		
		/*int sum = 0;
		int subtotal = 0;
		
		for(int i =1; i<=i; i++) {
			sum += i;
			System.out.print(sum+"+");
			subtotal += sum;
			if(i == 5) break;
		}
		System.out.print("="+subtotal);
		*/
		/*
		//과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?   5
		int b= -1;
		int h = 0;
		int sum = 0;
		
		for (int i = 1; i<=10; i++) {
			if(i %2 != 0) {
				h = i*b;
				sum+=h;
			}else
				sum+=i;
		}
		System.out.println("답은 "+sum);
		*/
		
		//과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?  7.07
		/*
		int j= 1;
		double sum1 = 0.0, total = 0;
		
		for(int i = 1; i <=10; i++) {
			j+=1;
			
			if(j == 11) break;
			sum1 = (double)i/j;
			
			total+= sum1;
					
		}
		System.out.printf("%.2f", total);
		
		//과제4] 3개 정수 입력 받아서 큰 순으로 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int i = 0, j = 0, k = 0;
		
		i = (a>b && a>c) ? a:(b>a && b>c) ? b:(c>a && c>b)? c:null;
		if(a == i) {
			j= (b>c)? b:(c>b)? c:null;
			if(b==j)
				k = c;
			else k = b;
			
		}else if(b == i) {
			j= (a>c)? a:(c>a)? c:null;
			if(a==j) {
				k=c;
			}else k=a;
			
		}else if(c == i) {
			j= (b>a)? b:(a>b)? a:null;
			if(j==a)
				k=b;
			else
				k=a;
		}
		System.out.println(a+", "+b+", "+c+"\n"+ i+" "+ j+" "+ k);
		*/
		
		//팀 과제1
		 	Scanner sc = new Scanner(System.in);
	        System.out.println("정수를 입력하세요 : ");
	        int n = sc.nextInt();
	        int answer = 0;
	        for (int i = 1; i <=n; i++){
	            if(n % i ==0){
	                answer +=i;
	            }
	        }
	        System.out.println(answer);
	}

}
