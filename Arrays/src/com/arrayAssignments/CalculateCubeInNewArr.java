package com.arrayAssignments;

public class CalculateCubeInNewArr {
	public static void calculateCube(int a[])
	{
		int newArr[] = new int[a.length];
		
		//System.out.println("Cube of given aray" + newArr.length);
		
		for(int i = 0; i < a.length; i++)
		{
			newArr[i] = a[i] * a[i] * a[i];
		
		}
		
		for(int j:newArr)
		{
			System.out.println(j);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5 };
		
		calculateCube(arr);

	}

}
