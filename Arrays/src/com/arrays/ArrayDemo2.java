package com.arrays;

public class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		//array literal
		char ch[] = {'a','b','c','d','e','f'};
		//char ch1 = new char[] {};
		
		int len = ch.length;
		System.out.println("Length of ch: " + len);
		System.out.println("First element of ch: " + ch[0]);
		System.out.println("Last element of ch: " + ch[len-1]);
		System.out.println("Last element of index no: " + (len-1) + "\n");

			//accessing array element using for loop
		//i=0
		//i<len
		
		for(int i = 0; i < len; i++)
		{
			System.out.println("Element of ch at " + i + ":" + ch[i]);
		}
	}

}
