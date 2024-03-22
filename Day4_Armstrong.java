import java.util.*;
class Day4_Armstrong
{
    public static void main(String arg[])
     {
       int num,rev=0,rem,x;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       x=num;
       while(num!=0)
       {
         rem=num%10;
         rev+=(rem*rem*rem);
         num/=10;
       }
       if(x==rev)
        {
           System.out.println("The number is armstrong number");
        }
        else
         {
           System.out.println("The number is not  armstrong number"); 
         }
       }
}
