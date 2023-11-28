package day6_sort;

// 버블 소트 두 수가 나와서 비교한 다음 작으면 작은 수가 앞으로 나오면서 자리 바꿈 그렇게 계속 반복함(내림차순)
// 숫자 비교 회전하면서 제외가 되니까  -i-1을 해줘야 함 
public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {7, 3, 2, 5, 8};
		int temp;
		
		System.out.println("\n******* sort 전 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		//sort 후
		for (int i= 0;  i< a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				
				if(a[j] > a[j+1]) { //교환
					temp = a[i];
					a[j] = a[j+1];
					a[j] = temp;
				
				} // if end
			
			} // j end
			
		} // i end
		
		System.out.println("\n******* sort 후 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
	}

}
