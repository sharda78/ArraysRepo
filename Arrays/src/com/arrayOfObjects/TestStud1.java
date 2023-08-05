package com.arrayOfObjects;

public class TestStud1 {

	public static void main(String[] args) {
	
		Stud1 s1 = new Stud1(101,"Leena",new double[] { 45,67,83});
		
		//or
		double m1[] = {33,55,63};
		double m2[] = { 45,77,48 };
		double m3[] = { 89,94,86};
		double m4[] = { 67,90,47 };
		
		Stud1 s2 = new Stud1(102,"ram" ,m1);
		Stud1 s3 = new Stud1(103,"john" ,m2);
		Stud1 s4 = new Stud1(104,"raj" ,m3);
		Stud1 s5 = new Stud1(105,"leena" ,m4);
		
		System.out.println("--Student1---");
		s2.display();
		
		System.out.println("---Student2------");
		s3.display();
		
		System.out.println("---Student2------");
		s4.display();
		
		System.out.println("---Student2------");
		s5.display();
		
		

		
		System.out.println("------Student1 by toString--------");
		System.out.println(s1);
		
	}

}
