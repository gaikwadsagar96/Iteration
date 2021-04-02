//2) Write a program to calculate and print the power of a number i.e a2 =a*a.
package com.hefshine.cw;

public class Q2_PowerOfNumber {

	public static void main(String[] args) 
	{
		int number=3,power=9,result=1;
		for(int i=1;i<=power;i++)
		{
			result=result*number;
		}
		System.out.println("result: "+result);
	}

}
