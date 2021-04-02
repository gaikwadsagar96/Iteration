/*Write a program to check whether a number is a Harshad Number or not.
 *  In recreational mathematics, a harshad number in a given number base,
 *   is an integer that is divisible by the sum of its digits when written in that base
 *   Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) 
 *   and 200 is divisible by 2. Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1)
 *    and 171 is divisible by 9. */
package com.hefshine.hw;

public class HarshadNumber {

	public static void main(String[] args) 
	{
		int num=202,temp=num,sum = 0;
		while(temp!=0)
		{
			sum+=temp%10;
			temp=temp/10;
		}
		if(num%sum==0)
			System.out.println("harshad number");
		else {
			System.out.println("Not harshad number");
		}
	}

}
