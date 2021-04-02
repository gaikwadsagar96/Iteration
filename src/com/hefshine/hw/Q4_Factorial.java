//Write a program to find factorial of a number
package com.hefshine.hw;

import java.util.Scanner;

public class Q4_Factorial {

	public static void main(String[] args) 
	{
		/*int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			fact=fact*i;
		
		System.out.println("factorial: "+fact);*/
		
		for(int i=1;i<100;i++) 
		{
			int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					cnt++;
			}
			if(cnt==2)
				System.out.print(" "+i+" ");
		}
	}

}
