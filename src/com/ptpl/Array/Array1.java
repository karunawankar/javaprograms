package com.ptpl.Array;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a[];
		System.out.println("Enter array size");
		int size= sc.nextInt();
		a= new int[size];
		System.out.println("Enter array element value");
		int i;
		for(i=0;i<size;i++)
		{
		a[i]=sc.nextInt();
		}
		System.out.println("Entered array element value");
		for(i=0;i<size;i++)
		{
		System.out.println(a[i]);

		}
		sc.close();
		}
		}

	
