package com.arrayAssignments;
/*
3.	WAP to take array and find even and odd numbers
4.	WAP to take array and print all positive numbers 
5.	WAP to print all negative elements in an array and also count total number
    of negative elements in an array.


 
 */
public class FindEvenOddNums 
{
	public static void findevenoddnums(int arr[])
	{
	int i ,len = arr.length,cnt = 0;
	
	System.out.println("------Even Number By Using For Loop--------");
	for(i=0; i<len; i++)
	{
		if(arr[i] % 2 == 0)
		{
			System.out.println(arr[i]);
		}
	}
	
	System.out.println("\n------Odd Number By Using For-Each Loop-------");
	for(int b:arr)
	{
		if(b % 2 != 0)
		{
			System.out.println(b);
		}
	}
	
	System.out.println("\n------Positive Number In Array--------");
	for(int x : arr)
	{
		if(x > 0)
		{
			System.out.println(x);
		}
	}
	
	System.out.println("\n-------Negative Number And It's Count In Array--------");
	for(int y : arr)
	{
		if(y < 0)
		{
			cnt++;
			System.out.println(y);
		}
			
	}
	System.out.println("Count is: " + cnt);
	
	
}

	private static boolean isPrime(int a) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		
		int num[] = {34,-67,80,-56,43,-21,-44,-84,32,55,-89,70};
		
		System.out.println("Even/Odd number in array");
		findevenoddnums(num);
	}

}
