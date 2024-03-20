import java.util.*;
class Leapyear_or_not
{
public static void main(String arg[])
{
int year;
Scanner sc=  new Scanner(System.in);
System.out.println("ENTER THE year");
year=sc.nextInt();
if(year%4==0)
{
System.out.println( +year+" IS Leap NUMBER");
}
else
{
System.out.println(+year+" IS  NOT Leap NUMBER");
}
}
}
