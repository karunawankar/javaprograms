package com.ptpl.Array;

import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the size of array");
			int size= sc.nextInt();
			int array[]= new int [size];
			System.out.println("Enter the element of array");
			for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
	      }
	       for(int i=0;i<array.length;i++) {
	       if(array[i]%2==0) {
	    	  
	    	 System.out.println("number is even"); 
	       }
	      else{
	    	  System.out.println("number is odd"); 
	}
	}
	}
	
}
