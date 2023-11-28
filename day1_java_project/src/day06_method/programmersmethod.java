package day06_method;

import java.util.Arrays;
import java.util.Iterator;

public class programmersmethod {
	public static void main(String[] args) {
		int[][] size = {{60,50},
						{30,70},
						{60,30},
						{80,40} };
		
		
//		[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	
		
		int lw =0, lh =0, min=0;
		
		
		
//		for (int i = 0; i < size.length-1; i++) {
//			if(size[i][0] >= size[i+1][0]){
//				lw=size[i][0];
//			}else
//				lw =size[i+1][0];
			
			Arrays.sort(size);
			
//			for (int j = 1; j < size[i].length; j++) {
//				if(size[i][j] >= size[i+1][j]){
//					lh=size[i][j];
				
			for (int i = 0; i < size.length; i++) {
				for (int j = 0; j < size.length; j++) {
					System.out.println(size[i][j]);
				}
				
			}
		

	}
}

