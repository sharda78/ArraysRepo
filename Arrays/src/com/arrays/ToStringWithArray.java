package com.arrays;

import java.util.Arrays;

class Student
{
	int rollno;
	String name;
	int marks[];
	Student(int rollno,String name,int marks[])
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	public static void sum(int marks[])
	{
		int sum = 0;
		int len = marks.length;
		for(int i = 0; i < len; i++)
		{
			
			sum = sum + marks[i] ;
			
		}
		System.out.println(" sum : " + sum);
		
	}
	
//	 public void display()
//	 {
//	 	System.out.println("Rollno: " + rollno);
//	 	System.out.println("Name: " + name);
//	 	System.out.println("Marks: " + Arrays.toString(marks));
//	 	for(int i = 0; i < marks.length; i++)
//	 	{
//	 		System.out.println(marks[i] + " ");
//	 	}
//	 	System.out.println("--------------------------------------");
//	 }
	 
}
public class ToStringWithArray {

	public static void main(String[] args) {
		//int  m[] = new int[5];
		// m1[0] = 34;
		
		int m1[] = { 1,2,3,4,5};
		int m2[] = {1,2,3,4,5};
		int m3[] = {56,89,78,67,98,67};
		
		//Student s1 = new Student(101,"John",new int[] {34,56,78,65,33 } );
		Student s2 = new Student(101,"John",m1 );
		Student s3 = new Student(101,"John",m2 );
		Student s4 = new Student(101,"John",m3 );
		
		
		
		
		
		
		//s2.display();
		//s3.display();
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		Student.sum(m1);

	}

}
