package pkg1;
public class Arithmatic2 { //Assignment2 ((((10-2)+2)*2)-2)/2)
	public int sum (int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum Result="+c);
		return c;
	}
	public int sub (int d,int e)
	{
		int f;
		f=d-e;
		System.out.println("Sub Result="+f);
		return f;
	}
	public int mul (int g,int h)
	{
		int i;
		i=g*h;
		System.out.println("Mul Result="+i);
		return i;
	}
	public  void div (int j,int k)
	{
		int l;
		l=j/k;
		System.out.println("Div Result="+l);	
	}
	public static void main(String[] agrs)
	{
		Arithmatic2 world=new Arithmatic2();
		int sub_result=world.sub(10, 2);
		int sum_result=world.sum(sub_result, 2);
		int mul_result=world.mul(sum_result, 2);
		int sub_reult1=world.sub(mul_result, 2);
		world.div(sub_reult1, 2);
	}
}