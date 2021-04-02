/*Write a program which prints 33 to 999. The numbers should be displayed as: i. 
 For multiples of 3 print "PINK" instead of the number 
 
ii. For the multiples of five print "YELLOW". 
 
iii. For numbers which are multiples of both three and five print "PINK & YELLOW". 
 
Also print count of how many times “PINK” was printed, “YELLOW” was printed and “PINK & YELLOW “was printed.*/
package com.hefshine.cw;

public class Q6_PinkYellow {

	public static void main(String[] args) 
	{
		int pink=0,yellow=0,pinkyellow=0;
		for(int i=33;i<=999;i++)
		{
			if(i%3==0||i%5==0)
			{
				if(i%5==0&&i%3==0)
				{
					System.out.print(" Pink & Yellow ");
					pinkyellow++;
				}
				else if (i%3==0&&i%5!=0) 
				{
					System.out.print(" Pink ");
					pink++;
				}
				else if(i%5==0&&i%3!=0)
				{
					System.out.print(" Yellow ");
					yellow++;
				}
			}
			else {
				System.out.print(" "+i+" ");
			}
		}
		System.out.println("Pink: "+pink+" Yellow :" +yellow+"Pink&Yellow: "+pinkyellow);

	}

}
