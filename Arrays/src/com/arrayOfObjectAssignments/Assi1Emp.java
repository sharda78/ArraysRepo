package com.arrayOfObjectAssignments;

class Employees
{
	int id;
	String name;
	float salary;
	
	Employees(int id,String name,float salary)
	{
		this.id= id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees : [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class Assi1Emp {

	public static void main(String[] args) {
		
		 Employees emp[] = new Employees[5];
		 emp[0] = new Employees(101,"John",15000f);
		 emp[1] = new Employees(102,"Leena",900f);
		 emp[2] = new Employees(103,"Ram",28000f);
		 emp[3] = new Employees(104,"Raj",700f);
		 emp[4] = new Employees(103,"Ram",67000f);
		 
		 
		 //System.out.println(emp[0]);
		 
		 for(int i = 0; i<emp.length; i++)
		 {
			System.out.println(emp[i]);
		 }
		 
		 System.out.println("\nEmployee Salary greater than 10000");
		 for(int i = 0; i < emp.length;i++)
		 {
			 if(emp[i].getSalary() > 10000)
			 {
				 System.out.println(emp[i]);
			 }
		 }
		
	}

}
