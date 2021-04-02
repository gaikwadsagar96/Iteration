//Write a program to find if given number is prime or not. 
package com.hefshine.hw;

import java.util.Scanner;

public class Q3_PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int cnt=1;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				cnt++;
		}
		if(cnt==2)
		{
			System.out.println("number is prime");
		}
		else {
			System.out.println("Number not prime");
		}

	}

}
