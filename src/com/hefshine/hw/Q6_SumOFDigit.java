//Write a program to find sum of all digits of a number entered by the user. 
package com.hefshine.hw;
import java.util.Scanner;
public class Q6_SumOFDigit 
{

	public static void main(String[] args) 
	{
		int m,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		m=sc.nextInt();
		while(m>0)	{
			n=m%10;
			sum=sum+n;
			m=m/10;
		}
		System.out.println("sum of digit: "+sum);
	}

}
