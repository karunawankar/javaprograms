package com.ptpl.Array;

public class TwoDArray {

	public static void main(String[] args) {
		
		int twod[][]= new int [4][5];
		int k = 0, i=0, j=0;
		for( i=0;i<4;i++) 
			for( j=0;j<5;j++) {
				twod[i][j]=k;
				k++;
			}
			for(i=0;i<4;i++) {
				for(j=0;j<5;j++)
					System.out.print(twod[i][j]+" ");
				System.out.println();
					
			}
				
		
	}

}
