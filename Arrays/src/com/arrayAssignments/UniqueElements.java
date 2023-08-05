package com.arrayAssignments;

public class UniqueElements 
{
	
	public static void uniqueElements(int arr[])
	{
		int i,j,len=arr.length;
		int count;
		
		for(i=0;i<len;i++) {
			count=0;
			if(arr[i]==-1)
				continue;
			for(j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}//inner
			if(count==0) {
				System.out.println(arr[i]);
			}
			
			
		}

	}

	public static void main(String[] args) {
		int num[]= {34,45,76,78,34,12,45,23,12,76,34,100,12,12};
		System.out.println("Unique elements in given array");
		uniqueElements(num);
		
			
			
		}
	}
	
