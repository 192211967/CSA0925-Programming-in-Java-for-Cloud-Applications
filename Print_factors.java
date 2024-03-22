import java.util.*;
class Print_factors
{
	public static void main(String arg[])
	{
		int n,i,c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE  number ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			c++;
			}
			
	    }
				System.out.println("TOTAL number OF FACTORS OF "+n+ " IS "+c);

	}
}