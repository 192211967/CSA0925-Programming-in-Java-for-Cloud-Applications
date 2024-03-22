import java.util.*;
class Perfect_number
{
	public static void main(String arg[])
	{
		int n,i,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE  number ");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
			sum=sum+i;
			}
	    }
		if(n==sum)
		{
				System.out.println(+n+" is a perfect number");
	    }
		else
		{
				System.out.println(+n+" is  not a perfect number");
	    }
		

	}
}