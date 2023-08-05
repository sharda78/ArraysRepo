package com.arrayAssignments;
/*
7.	Write two methods that return the average of an array with following headers.
a.	public static int average(int[] array)
b.	public static double average(double[] array).
c.	Write main and invoke the 2 methods. 

 */
public class ReturnAvg 
{
		public static int average(int[] array)
		{
			int len = array.length,sum =0;
			for(int i = 0; i < len; i++)
			{
				sum +=array[i];
			}
			double avg = sum / len;
			return (int) avg;
			
		}
		public static double average(double[] array)
		{
			int len = array.length,sum =0;
			for(int i = 0; i < len; i++)
			{
				sum +=array[i];
			}
			double avg = sum / len;
			return avg;
		}


	public static void main(String[] args) 
	{
		int []num = {3,4,5,2,1};
		double []array = {23.0,35.2,22.2,10.0,5.0};
		
		int res = average(num);
		double ans = average(array);
		System.out.println(res + "\n" + ans);

	}

}
