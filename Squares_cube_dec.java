import java.util.*;
class Squares_cube_dec
{
	public static void main(String arg[])
	{
		double n,sq,cu;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE decimal number ");
		n=sc.nextDouble();
			sq=Math.pow(n,2);
			cu=Math.pow(n,3);
	System.out.println("SQUARE IS :  "+sq);
	System.out.println("CUBE IS :  "+cu);

			
	}
}