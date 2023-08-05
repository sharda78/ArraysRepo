package com.arrayAssignments;

public class FindMaxMin {
	public static int findmax(int []arr)
	{
		int max = arr[0];
		int i ,len = arr.length;
		
		for(i = 1; i < len; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
			
	}
	
	public static int findmin(int []arr)
	{
		int min = arr[0];
		//float f[] = {2,4,5};
		int i ,len = arr.length;
		
		for(i = 1; i < len; i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
			
	}

	public static void main(String[] args) 
	{
		int []num = {23,45,21,78,99,34,10,65};
		System.out.println("Maximun Number is: " + findmax(num));
		System.out.println("Minimum Number is: " + findmin(num));
	}

}
