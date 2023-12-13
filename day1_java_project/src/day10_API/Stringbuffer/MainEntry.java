package day10_API.Stringbuffer;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // 초기 용량 16
		
		System.out.println(sb.hashCode());
		
		System.out.println("length    /    capacity");
		System.out.println(sb.length() +"  /  "+sb.capacity());
		System.out.println("============================");
		
		sb.append("encore");
		
		System.out.println(sb.length()+"   /   "+sb.capacity());
		System.out.println("============");
		
		
		sb.append("1234567890");
		System.out.println(sb.length()+"   /   "+sb.capacity());
		System.out.println("===========");
		
		sb.append("12348940 39302384   39828402983   48239092");
		System.out.println(sb.length()+"   /   "+sb.capacity());//capacity는 마지막 문자 null값이 들어가기에 16+16++16+16+2를 하는 것 2는 널값
		System.out.println("=====================");
		
		
		sb.trimToSize(); //메모리 공간 사이즈에 맞게 재조정
		System.out.println(sb.length()+"   /   "+sb.capacity());
		System.out.println("=====================");
		
		System.out.println(sb.hashCode());
		
		// 메모리의 공간은 항상 똑같음
		// 값이 계속 똑같음 그러면 String 클래스
		// 값이 수시로 바뀐다 Stringbuffer클래스 사용
		
		
	}

}
