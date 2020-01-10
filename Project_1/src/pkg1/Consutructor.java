	package pkg1;
	
	public class Consutructor {
		
		public Consutructor(int a,int b ,int c)	
		{
			System.out.println("3 parameterized constructor");			
		}
		
	public Consutructor() 
		{
		this (1,2,3);
			System.out.println("Default parameterized constructor");
		}
	public Consutructor(int a,int b ,int c , int d)
	{
		this(1);
		System.out.println("4  parameterized constructor");
	}
	public Consutructor(int a)
	
	{this ();
	
		System.out.println("1  parameterized constructor");
	}
	
	public Consutructor(int a,int b)
	{
		this(1,2,3,4);
		System.out.println("2  parameterized constructor");
	} 
	
	
	public static void main(String[] args) {
	
		Consutructor world=new Consutructor(1,2);
		
	}
	
	}
