package com.arrayAssignments;
/*
32. WAP to arrange the elements of an given array of integers where all negative integers appear before all the positive integers. 

 */
public class NegBeforePosNums 
{
	public static void arrangeNumline(int num[])
	{
		int i ,len = num.length;
		int newarr[] = new int[num.length];
		System.out.println("To Print All negative integers appear before all the positive integers. ");
		for(i = 0; i< len; i++)
		{
			if(num[i] < 0)
			{
				newarr[i] = num[i];
				System.out.print(newarr[i] + " ");
			}
			
		}

		for(i = 0; i< len; i++)
		{
			if(num[i] > 0)
			{
				newarr[i] = num[i];
				System.out.print(" " + newarr[i]);
			}
			
		}
		
				
	}

	public static void main(String[] args) {
		int arr[] = {9,-5,7,3,-3,1,-10,6,-2 };
		
		arrangeNumline(arr);
		

	}

}
