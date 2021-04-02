/*Given a number, the task is to check if it is Kaprekar number or not.
 *  A Kaprekar number is a number whose square when divided into two parts 
 *  and such that sum of parts is equal to the original number. */
package com.hefshine.hw;

import java.util.Scanner;

public class Q21_KaprekarNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sqr=num*num,a,b,c=1,sum,temp=num;
		while(temp>0)
		{
	
			c=c*10;
			temp=temp/10;
		}
		a=sqr%c;
		b=sqr/c;
		sum=a+b;
		if(num ==sum)
			System.out.println("kaprekar number");
		else {
			System.out.println("Not kaprekar number");
		}
	}

}
