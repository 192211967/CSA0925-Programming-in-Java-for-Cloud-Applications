import java.util.*;
class Positive_or_negitive
{
public static void main(String arg[])
{
int n;
Scanner sc=  new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
n=sc.nextInt();
if(n>0)
{
System.out.println("GIVEN NUMBER IS POSITIVE NUMBER");
}
 else if(n<0)
{
System.out.println("GIVEN NUMBER IS NEGITIVE NUMBER");
}
else if(n==0)
{
System.out.println("GIVEN NUMBER IS NOR-POSITIVE NEITHER-NEGITIVENUMBER");
}
}
}
