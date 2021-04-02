//Write a program to display even and odd numbers between a range entered by the user.
package com.hefshine.hw;

import java.util.Scanner;

public class Q7_EvenOddByUserRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter range :");
		n1=sc.nextInt();
		n2=sc.nextInt();
		for (int i = n1; i <= n2; i++) 
		{
			if(i%2==0)
				System.out.print(" "+i+" ");
		}

	}

}
