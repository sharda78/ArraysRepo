package com.arrayAssignments;
/*
 17.	WAP to merge 2 arrays to 3rd array. 3rd array should not have elements of same value.
 */
class NewArray
{
	public static int[] mergegivenarray(int[]a, int []b)
	{
		int i,j =0 ;
		int len1 = a.length;
		int len2 = b.length;
		int len3 = len1 + len2;
		
		
		int newarr[] = new int[len3];
		
		for( i = 0; i < len3; i++)
		{
			if(i < len1)
			{
				newarr[i] = a[i];
			}
			else 
			{
				newarr[i] = b[j];
				j++;
			}
					}
		
		return newarr;
	}
}
public class MergeArray
{
	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {40,50,60,70,80};
		
		System.out.println("---Merge Array-----");
		int []mynewarr = NewArray.mergegivenarray(arr1, arr2);
		
		int len = mynewarr.length,i,j;
		
	
		int count;
		
		for(i = 0; i < len; i++) 
		{
		count=0;
		
			if(mynewarr[i] == -1)
			continue;
			
			for(j = i+1; j < len; j++)
			{
				if(mynewarr[i] == mynewarr[j]) 
				{
				count++;
				mynewarr[j] = -1;
				}
				
			}//inner
			
			if(count==0) 
			{
				System.out.print(mynewarr[i] + " ");
			}
				

	}

	}
}
