package com.hefshine.hw;

import java.util.Scanner;

public class Q5_countNumberofDigit {

	public static void main(String[] args) 
	{
		int n,cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=sc.nextInt();
		while(n!=0){
			n=n/10;
			cnt++;
		}
		System.out.println("number of digit: "+cnt);
	}

}
