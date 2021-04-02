/* 
 1  0  1  0  1 
 0  1  0  1  0 
 1  0  1  0  1 
 0  1  0  1  0 
 1  0  1  0  1 
 */
package com.hefshine.hw;

public class Q16_Pattern {
	
	public static void main(String[] args) 
	{
		int temp=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(temp%2==0) {
					System.out.print(" 1 ");}
				else {
					System.out.print(" 0 ");}
				temp++;
			}
			System.out.println();
		}
	}

}
