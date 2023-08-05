package com.arrayAssignments;

public class ArrayAssign3 {

	public static void main(String[] args) {
		int []num = {2,-4,-15,60,-56,67};
		//int len = num.length;
		//enhance for loop
		for(int i =0; i < num.length; i++)
		{
			if(num[i] < 0)
			{
				System.out.println(num[i] + "\n");
			}
			
		}
		
		System.out.println("By using enhanced for loop");
		for(int a : num)
		{
			if(a < 0)
			{
				System.out.println(a);
			}
		}

	}

}
