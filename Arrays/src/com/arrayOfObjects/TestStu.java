package com.arrayOfObjects;

public class TestStu {
	public static void showNames(StudentB s[])
	{
		int i,len = s.length;
		for( i = 0; i < len; i++)
		{
			if(s[i].getMarks() >= 80)
			{
				System.out.println(s[i]);
			}
		}
	}

	public static void main(String[] args) {
		StudentB stuarr[] = new StudentB[5];
		
		System.out.println(stuarr[0]); // null
		
		stuarr[0] = new StudentB(11,"rahul",87);
		stuarr[1] = new StudentB(11,"nisha",56);
		stuarr[2] = new StudentB(11,"lina",70);
		stuarr[3] = new StudentB(11,"aasha",97);
		stuarr[4] = new StudentB(11,"rahul",37);
		
		//to display all elements in array by using toString method
		System.out.println(stuarr[0]);
		System.out.println(stuarr[1]);
		System.out.println(stuarr[2]);
		System.out.println(stuarr[3]);
		System.out.println(stuarr[4]);
	
		System.out.println("\nBy using for loop");
		for(int i = 0;i<stuarr.length;i++)
		{
			System.out.println(stuarr[i]);
		}
		
		System.out.println("\nby using enhanced for loop");
		for(StudentB s : stuarr)
		{
			System.out.println(s);
		}

		System.out.println("\nStudent got marks greater than 80");
		showNames(stuarr);
	}

}
