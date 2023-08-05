package com.arrayAssignments;

public class MergeArray1638 {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4};
		int arr2[] =  {5,6,7,8,9,10};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int len3 = len1 + len2;
		
		int arr3[] = new int[len3];
		
		//int index = 0;
		for(int i = 0; i < len3; i++)
		{
			if(i < len1)
			{
			if(arr1[i] % 2 != 0)
			{
				arr3[i] = arr1[i];
					//index++;
				}
				
				else
				{
					arr3[i] = arr2[i];
					//index++;
				}
			}
			else
			{
				arr3[i] = arr2[i];
			}
			
				
			System.out.println(arr3[i]);
			
		}

	}

}
