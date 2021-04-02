/*Write a program to print the first 15 numbers of the Pell series. 
 * In mathematics, the Pell numbers are an infinite sequence of integers.
 *  The sequence of Pell numbers startswith 0 and 1, and then 
 *  each Pell number is the sum of twice the previous Pell number and the Pell number before that.: 
 *  The first few terms of the sequence are : 0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,…*/
package com.hefshine.hw;

public class PellSeries {

	public static void main(String[] args) 
	{
		int p1=1,p2=0,p3;
		System.out.print(p2);
		for(int i=1;i<15;i++)
		{
			p3=p1+p2*2;
			System.out.print(" "+ p3+" ");
			p1=p2;
			p2=p3;
			
		}

		

	}

}
