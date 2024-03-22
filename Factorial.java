import java.util.*;
class Factorial
{
	public static void main(String arg[])
	{
		int i,n,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE NUMBER ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		fact=fact*i;
		}
		System.out.println("Factorial of "+n+"! is "+fact);
	}
}
		