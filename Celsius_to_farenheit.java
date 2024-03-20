import java.util.*;
class Conversion
{
void ctof()
{
double C,F;
Scanner sc=  new Scanner(System.in);
System.out.println("ENTER THE celsius");
C=sc.nextDouble();
F=(C*(9/5))+32;
System.out.println("FARENHEIT  IS  "+F);
}
void ftoc()
{
	Scanner sc=  new Scanner(System.in);
double C1,F1;
System.out.println("ENTER THE FARENHEIT");
F=sc.nextDouble();
C1=(F1 - 32.0) * (5.0/9.0);
System.out.println("CELSIUS  IS  "+C1);
}
public static void main(String arg[])
{
	Conversion C=new Conversion();
	C.ctof();
	C.ftoc();
}
}
