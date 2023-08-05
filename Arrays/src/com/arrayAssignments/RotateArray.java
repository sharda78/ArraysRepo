package com.arrayAssignments;
// Rotate array ...[4,5,6,7]........output [7,4,5,6]
public class RotateArray {

	public static void main(String[] args) {
		int arr[] = { 4,5,6,7};
		
		int lastIndex = arr.length-1;
		//System.out.println(lastIndex);
		int lastindexval= arr[arr.length-1];
		//System.out.println(lastindexval);
		int i;
		for( i = arr.length-2; i >= 0; i--)
		{
			arr[lastIndex] = arr[i];
			lastIndex--;
			
			if(i == 0)
			{
				arr[i] = lastindexval;
				
			}
			
			
		}
		
		for(int s:arr)
		{
		System.out.println(s);
		}
		
		

	}

}
