import java.util.*;
class Displayfactors
{
	public static void main(String arg[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	    System.out.println("FACTOR ARE : ");
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i+ " ");
			}
		}
	}
}