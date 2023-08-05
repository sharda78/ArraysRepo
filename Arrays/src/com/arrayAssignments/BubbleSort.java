package com.arrayAssignments;

import java.util.Arrays;

public class BubbleSort 
{
	public static int[] toSort(int arr[])
	{
		int i,j;
		for( i = 0; i < arr.length; i++)
		{
			for( j = 0; j< arr.length-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				}
				
			}//inner
			
		}//outer
		
		return arr;
	}


	public static void main(String[] args) {
		int num[] = {1,7,9,4,5,3,6};
		
		int sortedarr[]=toSort(num);
		System.out.println("---Sorted Array----");
		for(int s:sortedarr) {
			System.out.println(s);
		}
		
		System.out.println("---Sorted Array With Sort Method-----");
		Arrays.sort(num);
		for(int s:num) {
			System.out.println(s);
		}

	}

}
