package com.arrayAssignments;

public class Replace0With1 
{
	public static void replace(int num[],int search)
	{
		int i,len = num.length;
		for(i = 0; i < len; i++)
		{
			if(num[i] == 0)
			{
				num[i] = 1;
			}
			System.out.print(num[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		int num[] = {78,2,55,0,8,42,79,0,0,69,56};
		
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter index no");
		int search = 1;
		
		replace(num,search);
	}

}
