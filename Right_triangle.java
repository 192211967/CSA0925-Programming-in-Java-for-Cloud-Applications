import java.util.*;
class Right_triangle
{
	public static void main(String arg[])
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF THE ROWS");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}