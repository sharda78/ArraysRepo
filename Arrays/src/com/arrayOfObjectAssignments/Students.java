package com.arrayOfObjectAssignments;

public class Students {

	private int roll;
	private String name;
	private int age;
	private float marks; 
	
	
	public Students(int roll, String name, int age, float marks) {

		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}



	public static void main(String[] args) {
		Students stu[] = new Students[5];
		
		stu[0] = new Students(14,"John",18,50);
		stu[1] = new Students(15,"Leena",13,70);
		stu[2] = new Students(16,"Rohan",32,80);
		stu[3] = new Students(17,"Ram",12,90);
		stu[4] = new Students(18,"Kaira",20,90);
		
		for(int i = 0; i < stu.length; i++)
		{
			System.out.println("Roll no: " + stu[i].roll);
			System.out.println("Name: " + stu[i].name);
			System.out.println(stu[i].age);
			System.out.println(stu[i].marks);
			System.out.println("\n-----------------------");
		}
		
		for(int j = 0; j <stu.length; j++)
		{
			if(stu[j].marks > 60 && stu[j].age < 15)
			{
				System.out.println(stu[j].toString());
				//System.out.println(stu[j].toString());
			}
		}	
			
	

	}

}
