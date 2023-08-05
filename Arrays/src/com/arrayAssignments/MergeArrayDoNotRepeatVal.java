package com.arrayAssignments;

public class MergeArrayDoNotRepeatVal {
	
	public static void MergeWithDoNotrepeat(int c[])
	{
		
	}

	public static void main(String[] args) {
		
		int arr1[] = {1,3,4,5} ;
		int arr2[] = {2,4,6,8};
		
		int len1 = arr1.length;
		int len2  = arr2.length;
		int len3 = len1 + len2;
		int arr3[] = new int[len3];
		int i,index=0,j=0,k;
		boolean status = false;
		for( i = 0; i < len1; i++)
		{
			arr3[index++] = arr1[i];
		}
		for( j = 0; j < len2; j++)
		{
			status = false;
		}
		for( k=0; k < len3; k++)
		{
				if(arr3[k] == arr2[j])
					status = true;
	
		}
		
			
		}
		
	}


