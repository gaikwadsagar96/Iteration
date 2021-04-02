/*WRITE A PROGRAM  to print following Pattern 
 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 
 * 
 
   */
package com.hefshine.cw;

public class Q3_Pattern {

	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
