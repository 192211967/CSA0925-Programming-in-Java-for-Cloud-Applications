import java.util.*;
class Day3_Mul_tab
{
	public static void main(String arg[])
	{
		int n,i,t;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE  number ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			t=i*n;
			System.out.println(i+"*"+n+"="+t);
	    }

	}
}