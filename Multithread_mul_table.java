import java.util.*;          
class athread implements Runnable
{
	public void run()
	{
		for(int i = 1; i<=5; i++) 
		{
			System.out.println(5+" X "+i+" = "+i*5);
		}		
	}
}
class bthread implements Runnable
{
	public void run()
	{
		for(int i = 1; i<=5; i++) 
		{
			System.out.println(10+" X "+i+" = "+i*10);
		}
	}
}
class Multithread_mul_table
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