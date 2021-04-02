/*Write a program to generate a following triangle.
1 
1  2 
1  2  3 
1  2  3  4 
1  2  3  4  5 */

package com.hefshine.hw;

public class Q12_Pattern {

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=5;i++)
		{
			int temp=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+temp+" ");
				temp++;
			}
			System.out.println();
		}

	}

}
