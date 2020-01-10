package pkg1;
public class Arithmatic1 { //((((10+2)-2)+2)*2)/2)
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
		Arithmatic1 world=new Arithmatic1();
		int sum_result=world.sum(10, 2);
		int sub_result=world.sub(sum_result, 2);
		int sum_result1=world.sum(sub_result, 2);
		int mul_reult=world.mul(sum_result1, 2);
		world.div(mul_reult, 2);
		
		
	}
}