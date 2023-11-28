package day07_opp.ex02;

public class oppQuizTV {
	int channel;
	String color; //접근 지정자(private, public, default) 중에서 설정을 안하고 아무것도 안 써놓으면 default로 설정됌

//	public oppQuizTV() { // default constructor -> 괄호안에 아무것도 없는 것이 default생성자함수
//		color = "gray";
//		channel = 11;
//	}
	
	//default함수를 앞에 정의를 했는데 뒤에서 생성자함수 정의를 해놓으면 default함수 기능 상실
	
	//여기서부터
	public oppQuizTV(int channel) {
		this.channel = channel;
	}
	
	public oppQuizTV(String color) {
		this.color = color;
	}
	
	public oppQuizTV(String color, int ch) {
		this.color = color;
		channel = ch;
	}
	//여기까지 생성자 함수
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color; 
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void displayTV() {
		System.out.println("TV 색상 "+color+"\n현재 채널 : "+channel);
	}

}
