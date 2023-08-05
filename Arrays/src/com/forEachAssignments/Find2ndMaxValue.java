package com.forEachAssignments;

/*
 1. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
 */
public class Find2ndMaxValue {
	public static int[] sortedArray(int arr[]) {
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			} // inner

		} // outer

		return arr;
	}

	public static void main(String[] args) {
		int num[] = { 20, 0, 31, 45, 100, 1, 105, 90 };

		int sortedarr[] = sortedArray(num);
		System.out.println("---Sorted Array----");
//		for (int s : sortedarr) {
//			System.out.println(s);
//		}
	
		
		int maxnum = sortedarr[0];
		for(int  j = 0; j < sortedarr.length; j++)
		{
			if( sortedarr[j] > maxnum)
			{
				maxnum = sortedarr[j-1];
				
			}
		}
		
		System.out.println("Second maximun number: " + maxnum);
	}
}
