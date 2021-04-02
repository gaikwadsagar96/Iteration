//Write a menu driven program to find all prime, even and odd numbers between 1 to 100
package com.hefshine.hw;

import java.util.Scanner;

public class Q10_menuDriven {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		while(true)
		{
			System.out.println("\n1.Even NUmbers\n2.OddNumbers\n3.Prime Numbers\n4.Exit");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				for(int i =0;i<=100;i++)
				{
					if(i%2==0)
						System.out.print(" "+i+" ");
				}
				
				break;
			case 2:
				for(int i=1;i<=100;i++) {
					if(i%2!=0)
						System.out.print(" "+i+" ");
				}
				break;
					
			case 3:
				
				for(int i=1;i<100;i++) 
				{
					int cnt=0;
					for(int j=1;j<=i;j++)
					{
						if(i%j==0)
							cnt++;
					}
					if(cnt==2)
						System.out.print(" "+i+" ");
				}
				break;
			case 4:
				System.exit(4);
			default:
				System.out.println("Enter valid number");
				break;
			}
		}

	}

}
