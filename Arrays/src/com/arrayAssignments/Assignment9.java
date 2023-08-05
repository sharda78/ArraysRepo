package com.arrayAssignments;
//9.	//WAP to copy an array by iterating the array.
public class Assignment9 
{
	public static void main(String[] args) {
	 int arr[] = { 2,3,4,5,6,7};
	 int arr2[] = new int[arr.length];
	 
	 for(int i=0; i < arr.length; i++)
	 {
		 arr2[i] = arr[i];
	 }
	 for(int b : arr2)
	 {
		 System.out.println(b);
	 }

	}

}
