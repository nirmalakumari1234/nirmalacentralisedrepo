package pkg1;
import java.util.Scanner;//(((((x1+x2)-x3)+x4)*x5)/x6)
public class Class_Scan {
	int x1,x2,x3,x4,x5,x6;
	public int sum (int a,int b)
	{		int c=a+b;
		return c;
		}
	public int sub (int d,int e)
	{	int f=d-e;
		return f;
	}
	public int mul (int g,int h)
	{	int i=g*h;
		return i;
	}
	public  void div (int j,int k)
	{		int l=j/k;
	System.out.println("Final result is "+l);
	}
	public static void main(String[] args) {
	    Class_Scan R=new Class_Scan();
		System.out.println("Please Enter the value of x1");
		Scanner S=new Scanner(System.in);
		int x1=S.nextInt();
		System.out.println("Please Enter the value of x2");
		int x2=S.nextInt();
		System.out.println("Please Enter the value of x3");
		int x3=S.nextInt();
		System.out.println("Please Enter the value of x4");
		int x4=S.nextInt();
		System.out.println("Please Enter the value of x5");
		int x5=S.nextInt();
		System.out.println("Please Enter the value of x6");
		int x6=S.nextInt();
		int sum_result=R.sum(x1, x2);
		int sub_result=R.sub(sum_result, x3);
		int sum_result1=R.sum(sub_result, x4);
		int mul_reult=R.mul(sum_result1, x5);
		R.div(mul_reult, x6);	
	}
}
