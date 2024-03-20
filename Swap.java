import java.util.*;
class Swap
{
public static void main(String arg[])
{
int n1,n2,temp;
Scanner sc=  new Scanner(System.in);
System.out.println("ENTER THE VALUE OF n1");
n1=sc.nextInt();
System.out.println("ENTER THE VALUE OF n2");
n2=sc.nextInt();
temp=n1;
n1=n2;
n2=temp;
System.out.println(+n1);
System.out.println(+n2);
}
}
