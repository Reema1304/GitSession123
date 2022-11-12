package com.packagea;

import java.util.Scanner;

/* 
 * author: RuchikaRathod TeamLead
 * */
public class PrintArray1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length how many element you want to insert:");
		int len=sc.nextInt();
		System.out.println("Enter elements for array");
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Entered Array elements are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	

}
