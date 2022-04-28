package com.edu;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the name");
		String s=sc.next();
		 int vcount=0;
		 int ccount=0;
for(int i=0;i<=s.length();i++)
{
	char ch=s.charAt(i);
	if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u')
	{
		vcount++;
		
	}
	else 
	{
		ccount++;
	}
}
System.out.println("enter the total vowel+"+vcount);
System.out.println("enter the total consonent"+ccount);
	}

}
