/*Write a program  to print following Pattern 

 * 
 *  * 
 *  *  * 
 *  *  *  * 
 *  *  *  *  *
  
  */
package com.hefshine.hw;

public class Q11_Pattern {

	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
