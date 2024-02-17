import java.util.*;
class athread implements Runnable
{
      int a,b,c;
	public void run()
	{
	 a=10;
	 b=10;
	 c=a+b;
	System.out.println("ADDITION IS "+c);
	}
}
class bthread implements Runnable
{
	
int a,b,c;
	public void run()
	{
	 a=20;
	 b=10;
	 c=a-b;
System.out.println("SUBSTRACTION IS "+c);
	}
}
class cthread implements Runnable
{
	
int a,b,c;
	public void run()
	{
	 a=20;
	 b=10;
	 c=a*b;
System.out.println("MULTIPLICATION IS "+c);
	}
}
class dthread implements Runnable
{
	
int a,b,c;
	public void run()
	{
	 a=20;
	 b=10;
	 c=a/b;
System.out.println("DIVISION IS "+c);
	}
}
class Operationthread
{
	public static void main(String arg[])
	{
		athread a = new athread();
		Thread t1=new Thread(a);
		bthread b = new bthread();
		Thread t2=new Thread(b);
  		cthread c = new cthread();
		Thread t3=new Thread(c);
                dthread d = new dthread();
		Thread t4=new Thread(d);
		t1.start();
                t2.start();		
                t3.start();	
                t4.start();		

	}
}
