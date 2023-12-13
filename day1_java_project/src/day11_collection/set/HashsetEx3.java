package day11_collection.set;

import java.util.HashSet;
import java.util.Set;
import java.lang.*;//자동으로 임포트하고 있음


class Person {// extends Object{자동으로 넣어줘서 생략 가능
	String name;
	int age;
	
	public Person(int age, String name) { // 매개변수 넣은 순서에 따라 main도 매개변수 순서에 맞게 데이터를 넣어줘야 함
		this.name = name;
		this.age = age;
	}
	//String의 특성상 데이터 값이 같으면 같은 주소를 가르킴
	//그래서 다른 데이터인 int age를 같이 넣어줌
	
	@Override
	public int hashCode() {
		return name.hashCode()+age; //String은 데이터가 같으면 같은 주소를 가르킴 그래서 이름(data)이 같아도 다른 데이터 주소를 주기 위해서 age를 넣은 것
		//return Object.hash(name, age)
		//이름이 같아도 나이가 다르면 다른 데이터로 인식
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) { // min데이터를 담은 객체가 넘어옴
			Person temp = (Person)obj; // obj가 형이 크기에 명시적 형변환을 해줌
			return name.equals(temp.name)&& age == temp.age; //이름도 같고 나이도 같으면 같은 사람이야
			//return에 조건 넣어서 ture를 return했음
			//ture를 return하면 데이터가 같은 값이다 하고 set에 데이터를 담지 않음
			//set은 데이터 중복을 허용 안하기 때문에
		}
		return false;// return false는 set 그릇에 담기지 말라는 뜻
	}
	
	@Override
	public String toString()
	{
		return "Person [name="+name+", age = "+age+"]\n";
	}
	
}//Person end

public class HashsetEx3 {
	public static void main(String[] args) {
		Set set = new HashSet(); //<>타입을 제한하지 않으면 어떤 타입의 데이터든 다 받아줌
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		set.add(new String("virus"));
		
		Person ps = new Person(18, "aaa"); //Person 객체 생성하면서 데이터 값 삽입
		set.add(ps);
		set.add(new Person(18, "min"));
		set.add(new Person(20, "min"));
		set.add(new Person(18, "min")); // 같은 데이터가 들어오면 그 데이터를 덮어씀
		set.add(new Person(84, "min"));
		set.add(new Person(838, "min"));
		
		System.out.println(set);
//		A a= new A();
//		B b = new B();
//		A bb = new B();
////		B aa = new A(); // 이객체는 생성 불가
//		
//		System.out.println(b instanceof A);
//		System.out.println(b instanceof B);
//		System.out.println(a instanceof A);
//		System.out.println(a instanceof B); //앞에 있는 애가 뒤에 있는 애로 객체 생성되느냐
//		
		
		
	}

}

//class A{
//	String name;
//}
//
//class B extends A{
//	
//}
