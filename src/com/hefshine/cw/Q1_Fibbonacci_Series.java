//Write a program to display the Fibonacci series.
package com.hefshine.cw;

public class Q1_Fibbonacci_Series {

	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3,count=20;
		System.out.print(n1);
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			
			n1=n2;
			n2=n3;
			System.out.print("\t"+n3);
		}

	}

}
