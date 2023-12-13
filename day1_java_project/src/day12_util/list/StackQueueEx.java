package day12_util.list;
import java.util.*;

class StackQueueEx
{
	public static void main(String[] args) 
	{
		Stack st = new Stack();//LIFO
		// LinkedList는 Queue인터페이스를 구현하였다.
		Queue q = new LinkedList();	//FIFO
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {//isEmpty비워있니?? !을 붙여서 비워있지 않다면 출력해줘
			System.out.println(st.pop());
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {//isEmpty비워있니?? !을 붙여서 비워있지 않다면 출력해줘
			System.out.println(q.poll());
		}
	}
}