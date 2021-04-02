
/*WRITE A PROGRAM  to print following Pattern
1  2  3  4  5 
2  3  4  5 
3  4  5 
4  5 
5*/
package com.hefshine.cw;

import java.util.Iterator;

public class Q4_Pattern2 {

	public static void main(String[] args) 
	{
		for (int i = 0; i <=5; i++) 
		{
			int t=i;
			for (int j = i+1; j <=5; j++) 
			{
				System.out.print(" "+ ++t + " ");
			}
			System.out.println();
		}
		

	}

}
