package pkg1;

public class One_Method {

	public void method3 (int a,int b ,int c)	
	{
		System.out.println("3 parameterized Method");	
		this.method();
	}
	
public void method() 
	{

		System.out.println("Default parameterized Method");
		this.method1(1);
	}
public void method4(int a,int b ,int c , int d)
{
	
	System.out.println("4  parameterized Method");
	this.method2(1,2);
}
public void method1(int a)

{

	System.out.println("1  parameterized Method");
	this.method4(1,2,3,4);
}

public void method2(int a,int b)
{
	
	System.out.println("2  parameterized Method");
	
} 


public static void main(String[] args) {

One_Method world=new One_Method();
world.method3(1,2,3);
	
}

}