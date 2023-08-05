package com.arrayAssignments;
/*
 34.	WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’. 

35.	 WAP to find max character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘R’, ‘Z’, ‘p’], so max character is ‘x’. 

 */
public class FindMinMaxCharacter 
{
	public static void findminchar(char []minarr)
	{
		for( int i = 0; i < minarr.length; i++)
		{
			if(minarr[i] == 65 || minarr[i] == 97)
				System.out.println("Minimum Character In Given Array: " + minarr[i] + " \n");
		}
	}
	
	public static void findmaxchar(char maxarr[])
	{
		for( int i = 0; i < maxarr.length; i++)
		{
			if(maxarr[i] > 97)
			{
				System.out.println("Maximun Character In Given Array: " + maxarr[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		char []ch =   {'A','D','E','x','z','R'};
		char []ch1 = {'A','D','E','x','R','Z','p'};	
		
		findminchar(ch);
		findmaxchar(ch1);

	}

}
