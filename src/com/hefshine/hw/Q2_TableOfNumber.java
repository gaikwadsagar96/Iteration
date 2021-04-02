//Write a program to display table of a number.
package com.hefshine.hw;

import java.util.Scanner;

public class Q2_TableOfNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.print(" "+i*n+" ");
		}

	}

}
