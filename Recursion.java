import java.util.*;
class Factorial
{
	int fact(int n)
	{
		int f=1,i;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
}
	class Recursion
	{
		public static void main(String arg[])
		{
			Factorial f1=new Factorial();
			System.out.println("FACTORIAL IS "+f1.fact(5));
			System.out.println("FACTORIAL IS "+f1.fact(6));
		}
	}