package com.hefshine.hw;

public class Q19_Pattern {

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			int temp=1;
			for(int j=0;j<=i;j++)
			{
				if(temp%2==0)
				{
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				temp++;
			}
			System.out.println();
		}

	}

}
