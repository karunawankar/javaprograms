package com.ptpl.Array;
import java.util.Scanner;
public class SumNumArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size= sc.nextInt();
		int array[]= new int[size];
		int sum=0;
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
			
		}
		
		for	(int j=0;j<array.length;j++) {
			
			  sum=sum+array[j];
			
		}
		System.out.println("Sum of array ="+sum);

	}
}
