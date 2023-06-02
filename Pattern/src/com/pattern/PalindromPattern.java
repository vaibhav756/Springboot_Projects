package com.pattern;

public class PalindromPattern {

	public static void main(String[] args) {
		
		int max=5;
		for(int i=1;i<=max;i++)
		{
			char ch='A';
			for(int j=1;j<=i*2-1;j++)
			{
				if(j<i)
				{
				   System.out.print(ch+++" ");	
				}
				else if(j==i)
				{
					System.out.print(ch+" ");
				}
				else
				{
					System.out.print(--ch+" ");
				}
			}
			System.out.println();
		}

	}

}
