import java.util.*;
class Overload
{
	void print(int n1)
	{
		System.out.println("THE NUMBER IS "+n1);
	}
	void print(int n1,int n2)
	{
		System.out.println("THE NUMBER1 IS "+n1);
		System.out.println("THE NUMBER2 IS "+n2);
	}
	public static void main(String arg[])
	{
		Overload o1=new Overload();
		o1.print(10);
		o1.print(20,80);
	}
}