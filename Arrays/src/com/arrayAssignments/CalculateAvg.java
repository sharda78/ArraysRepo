package com.arrayAssignments;
/*
 28.	WAP to calculate average of all elements in an Array except max and min element
  		(Means don’t include the highest and lowest number of your array in your average).
 */
public class CalculateAvg 
{
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
	

	public static void main(String[] args) {
		int []num = {1,2,3,4,5,6};
		int maxnum = findmax(num);
		int minnum = findmin(num);
		System.out.println("Maximun Number is: " + maxnum);
		System.out.println("Minimum Number is: " + minnum);
		
		
		
		int sum = 0;
		 for(int i = 0; i < num.length; i++)
		 {
			 if(num[i] == maxnum || num[i] == minnum)
			 {
			 continue;
			 }
			 sum = sum + num[i];
		 }
		 System.out.println("Avg: "+ sum/(num.length-2));
		 

	}

}
