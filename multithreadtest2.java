class athread implements Runnable
{
  public void run()
{
  int n1=0,n2=1,n3;
  System.out.println(n1);
  System.out.println(n2);
  for(int i=1;i<=3;i++)
    {
      n3=n1+n2;
      n1=n2;
      n2=n3;
      
      System.out.println(n3);
    }
}
}
class multithreadtest2
{
  public static void main(String arg[])
{
  athread a=new athread();
  Thread t1=new Thread(a);
  t1.start();
}
}