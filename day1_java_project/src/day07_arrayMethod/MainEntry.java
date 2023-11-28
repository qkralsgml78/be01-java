package day07_arrayMethod;

public class MainEntry {

	public static void main(String[] args) {
		int x=3, y=5;
		
		int result = methodEx(x, y);
		System.out.println(result);
		
		int[] arrResult = methodEx2();
		for (int i = 0; i < arrResult.length; i++) {
			System.out.print(arrResult[i]+"\t");
		
		}
		for (int item : arrResult) {
			System.out.print(item +"\t");
			
		}
		System.out.println();
		//2차우너 배열 함수 만들기 -더한 결과 출력------
		int[][] resultArr = methodEx3();
		int sum=0;
		
		for (int i = 0; i < resultArr.length; i++) {
			for (int j = 0; j < resultArr[i].length; j++) {
				System.out.print(resultArr[i][j]+"\t");
				sum+= resultArr[i][j];
			} //j end
			System.out.println();
		}// i end
		System.out.println("sum = "+sum);
		System.out.println("************foreach문으로 2차원 배열 데이터 출력************");
		for(int[] item:resultArr) { //0번째 행의 시작 주소, 1번째 행의 시작 주소를 담음
			for(int arrItem: item) {  //
				System.out.println(arrItem +"  ");
			}// arrItem end
			System.out.println();
		}// item end
		
		System.out.println("\n=======================");
		int index =0;
		for(int[] item: resultArr) {
			System.out.println("index = "+index);
			System.out.println(item); // 데이터 들어 있는 주소 출력됨
			System.out.println(item.hashCode());// 메모리상의 주소(16진수형태)를 10진수 형태 메모리 주소로 보여줌
		}
		
	}// main end

	private static int[][] methodEx3() {
		int[][] arr = {{1,2,3,4},{5,6,7,8}};
		return arr;
	}

	private static int[] methodEx2() {
		int[] arr = {1,2,3,4,5,6,7,8,9}; // 이 많은 데이터를 main에 가지고 가는 것이 아니라 stack에 저장된 배열 시작 주소를 main에 가지고 감으로 써 다음 값을 찾기가 쉬움
		return arr;
	}

	public static int methodEx(int x, int y) {
		// TODO Auto-generated method stub
		
		return x+y;
	}
}
