package com.arrayAssignments;

public class DuplicatElement 
{
	//case 1-only works if frq for element is 2
		public static void printDuplicateElements1(int arr[]) {
			int i,j,len=arr.length;
			//int count=0;
			for(i=0;i<len;i++) {
				
				for(j=i+1;j<len;j++) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[i]);
					}
				}//inner
				
			}
			
		}
		
		public static void printDuplicateElements(int arr[]) {
			
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
				if(count>=1) {
					System.out.println(arr[i]);
				}
			}
		}


	public static void main(String[] args) {
		int num[]= {34,45,76,78,34,12,45,23,12,76,34,100,12,12};
		//printDuplicateElements1(num);
		System.out.println("----------");
		printDuplicateElements(num);


	}

}
