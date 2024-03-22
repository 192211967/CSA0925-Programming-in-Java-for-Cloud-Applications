import java.util.*;
class Sum_digits
{
    public static void main(String arg[])
     {
       int num,sum=0,rem,x;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       while(num!=0)
       {
         rem=num%10;
         sum+=(rem);
         num/=10;
       }
           System.out.println("The sum of digits is"+sum); 
       }
}
