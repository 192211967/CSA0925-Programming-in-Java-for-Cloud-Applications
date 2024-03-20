import java.util.*;
class Simpleintrest
{
public static void main(String arg[])
{
float P,N,R,SI;
Scanner sc=  new Scanner(System.in);
System.out.println("ENTER THE PRINCIPLE AMOUNT");
P=sc.nextFloat();
System.out.println("ENTER THE VALUE OF NUMBER OF MONTHS");
N=sc.nextFloat();
System.out.println("ENTER THE VALUE OF RATE OF INTREST");
R=sc.nextFloat();
SI=(P*N*R)/100;
System.out.println("SIMPLE INTREST IS  "+SI);
}
}
