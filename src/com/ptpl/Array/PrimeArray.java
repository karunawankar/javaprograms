package com.ptpl.Array;
import java.util.Scanner;
public class PrimeArray {

	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		if(num<=3) {
			return false;
			if(num%2==0||num%3==0) {
			return false;
		}
		int i=5;
		while(i*i<=num) {
		if(num%i==0 || num%(i+2)==0) {	
			return false;
			
		}
		i+=6;
		}
		{
		return true;
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the starting range: ");
		int startRange= sc.nextInt();
		System.out.println("Enter the ending  range: ");
		int endRange= sc.nextInt();
		if(startRange>=endRange) {
			System.out.println("Invalid range,starting range shoulde be lesss than ending range ");	
		}
		else {
			int[] primeNumbers=new int[endRange-startRange+1];
			int count=0;
			for(int num=startRange;num<=endRange;num++) {
				 if (isPrime(num)) {
	                    primeNumbers[count] = num;
	                    count++;
	                }
	            }

	            if (count > 0) {
	                System.out.println("Prime numbers in the given range:");
	                for (int i = 0; i < count; i++) {
	                    System.out.print(primeNumbers[i] + " ");
	                }
	            } else {
	                System.out.println("No prime numbers found in the given range.");
	            }
	     
		}
	}
	}
