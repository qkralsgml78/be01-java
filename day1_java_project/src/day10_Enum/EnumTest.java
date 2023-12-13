package day10_Enum;
//클래스 안에 있어도 밖에 있어도 상관 없은
// 가독성을 위해 밖으로 뺀 것

/*
 Enum 열거형: 새로운 클래스 타입을 정의하는 것
특정한 값만을 가질 수 있는 데이터 타입을 정의할 때 필요

>형식
[접근지정자]enum 열거형 이름 {필요한 상수형 나열...}
 */
enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, TEURSDAY, FRIDAY, SATUDAY
}

public class EnumTest{
	Day day;
}

public EnumTest(Day day) {
	this.day = day;
}

public void tellItLikeItis() {
	switch(day) {
	case MONDAY:
		System.out.println("monday is bad..");
		break;
	case TUESDAY:
		System.out.println("tuesday is not bad..");
		break;
	case SATUDAY:
		System.out.println("weekends is so good!");
		break;
		
	default:
		System.out.println(" not bad");
	}
}
}


