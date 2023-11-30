package day06_array.ex03;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		int[][][] a= new int[2][2][3];
		//2.
		int[][][] a1 = new int[][][] { { {1,2,3,},{4,5,6} } ,{ {7,8,9},{1,2,3} } };
		//3.
		int[][][] a2 = { { {1,2,3,},{4,5,6} } ,{ {7,8,9},{1,2,3} } };
		
		System.out.println("면길이 : "+ a.length);
		System.out.println("행길이 : "+ a2[0].length);
		System.out.println("열길이 : "+ a2[0][0].length);
		System.out.println("열길이 : "+ a1[1][0].length);
		
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2[i].length; j++) {
				for (int j2 = 0; j2 < a2[i][j].length; j2++) {
					
					System.out.println(a2[i][j][j2]);
					}
				System.out.println();
				}
				System.out.println();
			}
		}
	}

