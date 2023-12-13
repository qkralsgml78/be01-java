package day12_util.list;
import java.util.*; 

public class ArrayListLinkedListTest2 { 
      public static void main(String args[]) { 
            ArrayList al = new ArrayList(1000000); 
            LinkedList ll = new LinkedList(); 
            add(al); //arrayList도 함수로 추가
            add(ll); //LinkedList도 함수로 추가

            System.out.println("= 접근 시간 테스트 ="); 
            System.out.println("ArrayList :"+access(al)); 
            System.out.println("LinkedList :"+access(ll)); 
	  }

      public static void add(List list) { 
            for(int i=0; i<100000;i++) list.add(i+""); //i를 넣고 공백을 추가
      } 

      public static long access(List list) { 
            long start = System.currentTimeMillis(); 
            
            for(int i=0; i<10000;i++) list.get(i); 
            
            long end = System.currentTimeMillis(); //초단위
            
            return end - start; 
      } 
}