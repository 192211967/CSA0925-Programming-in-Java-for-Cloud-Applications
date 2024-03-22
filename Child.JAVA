import java.util.*;
class Parent
{
	void display()
	{
		 System.out.println("THIS IS PARENT CLASS");
	}
}
class Child extends Parent
{
	void display1()
	{
		 System.out.println("This is child class");
	}
	public static void main(String arg[])
	{
		Parent p1=new Parent();
		Child c1=new Child();
		p1.display();
		c1.display1();
		c1.display();
	}
}
