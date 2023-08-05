package com.arrayAssignments;

public class ConcatenateArray {
	
	
	public static void main(String[] args) {
		int arr1[] = {1,3,4,5} ;
		int arr2[] = {2,4,6,8};
		
		int len1 = arr1.length;
		int len2  = arr2.length;
		int len3 = len1 + len2;
		int arr3[] = new int[len3];
		
		for(int  i = 0; i < len1; i++)
		{
			arr3[i] = arr1[i];
		}
		for(int j = 0; j < len2; j++)
		{
			arr3[len1 + j] = arr2[j];
		}
		for(int k : arr3)
		{
			System.out.print(k + " ");
		}
		
		

	}

}
