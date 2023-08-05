package arraylab.model;

public class TestBook1 {

	public static void main(String[] args) {
		Books b[] = new Books[5];
		
		b[0] = new Books(101,"Historic" ,200);
		b[1] = new Books(102,"Religious" ,500);
		b[2] = new Books(103,"Astrological" ,100);
		b[3] = new Books(104,"Physics" ,450);
		b[4] = new Books(105,"Chem" ,750);

		
		System.out.println("---By using for loop------");
		for(int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("\n----By using for each loop-----");
		for(Books c : b)
		{
			System.out.println(c);
		}
	}

}
