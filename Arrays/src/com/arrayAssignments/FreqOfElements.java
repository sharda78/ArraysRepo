package com.arrayAssignments;
//16.	WAP to count frequency of each element in an array.
public class FreqOfElements {
	
	public static void findfreqn(int arr[])
	{
		int len = arr.length,cnt ;
		System.out.println("freqn Elements Are: ");
		for(int i=0; i < len; i++)
		{
			cnt = 1;
			if(arr[i] == -1)
				continue;
			for(int j=i+1; j<len; j++)
			{
				if(arr[i] == arr[j])
				{
					cnt++;
				arr[j] = -1;
				}
			
			}// inner
			System.out.println( arr[i]+ "=" + cnt);
		
		
		
//		if(cnt >= 2)
//		{
//			System.out.println("Duplicate Numbers are: " + arr[i]);
//		}
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {34,45,76,78,34,12,45,23,12,76,34,100,12,12};
		
		findfreqn(num);
	}

}
