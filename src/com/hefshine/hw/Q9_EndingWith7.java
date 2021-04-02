//Write a program to display elements   between 100 to 200 (both numbers excluded) ending with seven. {Hint: output-107,117,127….} 
package com.hefshine.hw;

public class Q9_EndingWith7 {

	public static void main(String[] args) 
	{
		for(int i=100;i<200;i++)
		{
			if(i%10==7)
				System.out.print(" "+ i+" ");
		}

	}

}
