import java.util.*;
class Week_day
{
public static void main(String arg[])
{
	int Wn=0;
	Scanner sc=  new Scanner(System.in);
System.out.println("ENTER WEEK NO FROM 1 TO 7");
Wn=sc.nextInt();
switch(Wn)
{
	case 1: 
	{
	System.out.println("SUNDAY");
	break;
	}
	case 2: 
	{
	System.out.println("MONDAY");
	break;
	}
	case 3: 
	{
	System.out.println("TUESDAY");
	break;
	}
	case 4: 
	System.out.println("WEDNESDAY");
	break;
	case 5: 
	{
	System.out.println("THURSDAY");
	break;
	}

	case 6: 
	{
	System.out.println("FRIDAY");
	break;
	}

	case 7: 
	{
	System.out.println("SATURDAY");
	break;
	}
	default:
	{
		System.out.println("INVALID INPUT");
	}
}
}
}