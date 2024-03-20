import java.util.*;
class Lucky
{
public static void main(String arg[])
{
	int ln=0;
	Scanner sc=  new Scanner(System.in);
System.out.println("ENTER  NO ");
ln=sc.nextInt();
switch(ln)
{
	
	case 105: 
	{
	System.out.println("congratulations you are winner");
	break;
	}
	default:
	{
		System.out.println("better luck next time");
	}
}
}
}