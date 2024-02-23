import java.util.*;
class Pyramid
{
	public static void main(String arg[])
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF THE ROWS");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}