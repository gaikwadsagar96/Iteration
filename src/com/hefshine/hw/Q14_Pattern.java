/*
 1 
 2  1 
 3  2  1 
 4  3  2  1 
 5  4  3  2  1
 */
package com.hefshine.hw;

public class Q14_Pattern 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			int temp=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+temp+" ");
				temp--;
			}
			System.out.println();
		}

	}

}
