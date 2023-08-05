package com.arrayAssignments;
/*
 27.	Write a Java program to find a missing number in an array. 
 	Means e.g. array has 1 to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5 
 */
public class MissingNum 
{
	public static void findMissingNum(int num[]) {
		int len = num.length;
		int min = num[0], max = num[0];

		for (int i = 1; i < len; i++) {
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Maximun Num: " + max);
		System.out.println("Minimun Num: " + min);
		System.out.println("Missing Number are: ");
		while (min <= max) {
			int flag = 0;
			for (int j = 0; j < len; j++) {
				if (min == num[j]) {
					flag = 1;
					break;

				}

			}
			if (flag == 0) {
				System.out.println(min);

			}
			min++;

		}

	}
	

	public static void main(String[] args) 
	{
		int arr[] = { 1,4,6,7};
		
		 findMissingNum(arr);
		
//		for(int b: nbr)
//		{
//			System.out.println(b);
//		}
		

	}

}
