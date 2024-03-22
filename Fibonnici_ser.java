import java.util.*;
class Fibonnici_ser
{
	public static void main(String arg[])
	{
		int n1=0,n2=1,n3,N,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		N=sc.nextInt();
		System.out.println("fibonicci series are ");
		System.out.println(" "+n1);
		System.out.println(" "+n2);
		for(i=2;i<N;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
		}
	}
}