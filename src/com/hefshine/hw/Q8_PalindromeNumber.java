//Write a program to check and display if a given number is palindrome or not.
package com.hefshine.hw;

import java.util.Scanner;

public class Q8_PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int numcopy=num,remender;
		int reverceInteger=0;
		while(numcopy>0) {
			remender=numcopy%10;
			reverceInteger=reverceInteger*10+remender;
//			System.out.println(s);
			numcopy=numcopy/10;
		}
		
		if(reverceInteger==num)
			System.out.println("palindrome");
		else {
			System.out.println("not palindrome");
		}

	}

}
