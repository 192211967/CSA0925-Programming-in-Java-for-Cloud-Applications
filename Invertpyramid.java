import java.util.*;
class Invertpyramid
{
public static void main(String arg[])
{
int i,j,count=0,n;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
n=sc.nextInt();
for(i=n;i>=1;i--)
{
	for(j=i;j<n;j++)
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
