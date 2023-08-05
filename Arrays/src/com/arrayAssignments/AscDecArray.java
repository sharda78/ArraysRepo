package com.arrayAssignments;

public class AscDecArray 
{

	public static int[] toSort(int arr[])
	{
		int i,j,k;
		for( i = 0; i < 6; i++)
		{
			for( j = 0; j< 2; j++)
			{
				
				if(arr[j] < arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				
				}
				
			}//inner
			
			
			
			for(k = 3; k < 6; k++ )
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				
				}
			}
			
		}//outer
		
		
		return arr;
	}
	public static void main(String[] args) 
	{
		int arr1[] = {9,4,12,4,8,7,10 };
		
		int sortedarr[]=toSort(arr1);
		System.out.println("---Sorted Array----");
		for(int s:sortedarr) {
			System.out.println(s);
		}
	}

}
