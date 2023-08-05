package com.arrayAssignments;
/*
 8.	WAP to search for a given number in an array and accordingly print the index if exists
 */
import java.util.Scanner;

public class SearchElement {

	public static void search(int arr[],int search)
	{
		int i,len = arr.length,pos = -1;
		
		for(i = 0;i<len;i++)
		{
			if(search == arr[i])         // we don't take continue here because we have to avoid iteration
			{
				pos = i;
				break;
			}
		}
		if(pos != -1)
		{
			System.out.println(search + " is present at index " + pos);
		}
		else
		{
			System.out.println(search + " is not present in given array");
		}
	}
	public static void main(String[] args) {
		int num[] = {23,45,67,89,20,54,68};
		int search;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number which you want to search");
		search = sc.nextInt();
		
		
		search(num,search);
	}

}
