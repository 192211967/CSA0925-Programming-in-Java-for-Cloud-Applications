import java.util.*;
class Nooffactors
{
public static void main(String arg[])
{
int i,j,count=0,n;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
System.out.println("no of the factors are "+count);
}
}
