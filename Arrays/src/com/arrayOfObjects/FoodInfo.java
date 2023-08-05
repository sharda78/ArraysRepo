package com.arrayOfObjects;
class Food
{
	int fid;
	String fname;
	double fprice;
	
	public Food(int fid,String fname,double fprice)
	{
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
	}

	public int getFid() {      // if we make data private so we can go for setter/getter 
								//bcoz we cann't acess private data member in main method
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getFprice() {
		return fprice;
	}

	public void setFprice(double fprice) {
		this.fprice = fprice;
	}

	@Override
	public String toString() {
		return "Food [fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + "]";
	}
	
	
	
	
	
}
public class FoodInfo {

	public static void main(String[] args) {
		//creating array of object
		Food foods[] = new Food[5];
		
		System.out.println("--------Food Details------------");
		/*
		 for(int i = 0; i < foods.length; i++)
		 sysout(foods[i]);
		 */
		for(Food f : foods)
		{
			System.out.println(f);  //print null values
		}
		
		//instantiation
		foods[0] = new Food(1,"Pav-Bhaji",200);
		foods[1] = new Food(2,"Misal-Pav",170);
		foods[2] = new Food(3,"Masala-Dosa",50);
		foods[3] = new Food(4,"Butter-Pulav",110);
		foods[4] = new Food(5,"Gulab-Jamun",150);
		
		//Accessing - Case-1
		System.out.println("\n------- Case-1 ----------------------");
		System.out.println(foods[0].getFid());
		System.out.println(foods[0].getFname());
		System.out.println(foods[0].getFprice());
		
		System.out.println("\n----------- Case-2 --------------------");
		//Accessing - Case-2
		System.out.println(foods[1].getFid());
		System.out.println(foods[1].getFname());
		System.out.println(foods[1].getFprice());
		
		
		//case-3
		System.out.println("\n------  Case-3 -----food details by loop------------------");
		for(int i = 0; i<foods.length; i++)
		{
			System.out.println(foods[i].getFid());
			System.out.println(foods[i].getFname());
			System.out.println(foods[i].getFprice());
			System.out.println("-------------------------------------");
		}
	
		// case - 4
		System.out.println("\n----- Case-4 ------By using for-each loo-----------------");
		for(Food f: foods)
		{
			System.out.println(f.getFid());
			System.out.println(f.getFname());
			System.out.println(f.getFprice());
			System.out.println("----------------------------");
		}	
		

	}

}
