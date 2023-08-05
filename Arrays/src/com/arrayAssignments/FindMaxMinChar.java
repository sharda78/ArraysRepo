package com.arrayAssignments;

public class FindMaxMinChar {
	public static int findmax(char[] ch1)
	{
		int max = ch1[0];
		int i ,len = ch1.length;
		
		for(i = 1; i < len; i++)
		{
			if(ch1[i] > max)
				max = ch1[i-1];
		}
		return max;
			
	}
	
	public static int findmin(char []ch3)
	{
		int min = ch3[0];
		//float f[] = {2,4,5};
		int i ,len = ch3.length;
		
		for(i = 1; i < len; i++)
		{
			if(ch3[i] < min)
				min = ch3[i];
		}
		return min;
			
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ch =   {'A','D','E','x','z','R'};
		char []ch1 = {'A','D','E','x','R','Z','p'};	
		
		int ans = findmin(ch);
		System.out.println("Minimun Char: " + (char)ans);
		int ans1= findmax(ch1);
		System.out.println("Maximin Char: " + (char)ans1);

	}

}
