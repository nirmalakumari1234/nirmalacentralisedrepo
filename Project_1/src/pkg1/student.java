package pkg1;

public class student {
	
	int age;
	int roll_no;
	
	public void display()
	{
		System.out.println("Welcome all of you ");
	}
	
	public static void main(String[] args)
	{	
		student world=new student();
		world.age=30;
	    world.roll_no=39;
		System.out.println("age" + world.age);
		System.out.println("roll_no" + world
				.roll_no);
		world.display();
		
	}

}
