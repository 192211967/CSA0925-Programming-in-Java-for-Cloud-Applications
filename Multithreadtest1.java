import java.util.*;
class athread implements Runnable
{
	public void run()
	{
  try
{
		for(int i = 1; i<=5; i++) 
		{
			System.out.println(i+" X 7 = "+i*7);
Thread.sleep(1000);
		}
}		
catch(Exception e)
{
System.out.println("e");
}
System.out.println("EXTENDS THREAD A");

}
}
class bthread implements Runnable
{
	public void run()
{
try
	{
		for(int i = 1; i<=5; i++) 
		{
			System.out.println(i+" X 9 = "+i*9);
Thread.sleep(2000);
		}
	
}
catch(Exception e)
{
System.out.println("e");
}
System.out.println("EXTENDS THREAD B");
}
}
class Multithreadtest1
{
	public static void main(String arg[])
	{
		athread a = new athread();
		Thread t1=new Thread(a);
		bthread b = new bthread();
		Thread t2=new Thread(b);
		t1.start();
                t2.start();		
	}
}
