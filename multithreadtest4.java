class athread implements Runnable
{
  public void run()
{
    int n1=12,n2=12;
    int n3=n1+n2;
    System.out.println("The addition is:"+n3);
}
}
class bthread implements Runnable
{
  public void run()
{
 int n1=32,n2=12;
 int n3=n1-n2;
 System.out.println("The subtraction is:"+n3);
}
}
class cthread implements Runnable
{
  public void run()
{
  int a=12,b=12;
  int c=a*b;
  System.out.println("The multiplication is:"+c);
}
}
class dthread implements Runnable
{
  public void run()
{
  int a=12,b=12;
  int c=a/b;
  System.out.println("The Division is:"+c);
}
}

class multithreadtest4
{
  public static void main(String arg[])
{
  athread a=new athread();
  Thread t1=new Thread(a);
  bthread b=new bthread();
  Thread t2=new Thread(b);
  cthread c=new cthread();
  Thread t3=new Thread(c);
  dthread d=new dthread();
  Thread t4=new Thread(d);

  t1.start();
  t2.start();
  t3.start();
  t4.start();
}
}