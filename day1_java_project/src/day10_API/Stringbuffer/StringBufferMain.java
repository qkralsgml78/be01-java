package day10_API.Stringbuffer;

public class StringBufferMain {
	public static void main(String[] args) {
		
		StringBuffer sb =new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil"); //문자열을 마지막 끝에 추가시킴
		System.out.println(sb);
		
		sb.insert(7, " my"); //문자열을 내가 원하는 위치에 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your");  //시작위치와 끝위치를 넣어서 문자열 변경
		System.out.println(sb); 
		
		//sb자체가 주소이기때문에 완전히 바꾸는 것
		System.out.println(sb.reverse()); //문자열 역으로 출력
		System.out.println(sb.length()); //19
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
