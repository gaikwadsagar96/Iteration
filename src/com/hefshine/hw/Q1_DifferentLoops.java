//1) Write a program to display 1 to 10 by implementing different loops. 
package com.hefshine.hw;

public class Q1_DifferentLoops {

	public static void main(String[] args) 
	{
		System.out.println("Using for loop");
		for (int i = 1; i <=10; i++) {
			System.out.print("\t"+i);
		}
		System.out.println("\nUsing while loop");
		int i=1;
		while(i<=10)
		{
			System.out.print("\t"+i);
			i++;
		}
		
		
		
	}

}
