package com.arrayAssignments;
//Rotation of an Array....[3,1,7,8].....output[8,7,1,3]

public class RotateArray2 {

	public static void main(String[] args) {
		int arr[] = { 3,1,7,8};
		
		int lastIndex = arr.length-1;
		int lastIndexValue = arr[arr.length-1];
		//System.out.println(lastIndexValue);
		System.out.print(" Input: [3 1 7 8]\n Output: [");
		for(int i = lastIndex; i >= 0; i--)
		{
			arr[lastIndex] = arr[i];
			lastIndex--;
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}

}
