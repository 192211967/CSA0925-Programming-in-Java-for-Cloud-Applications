import java.util.*;
class SwapNumbers 
{
    public static void main(String args[])
 {
        Scanner sc = new Scanner(System.in);
double fn,sn,temp;
        System.out.print("Enter the first number: ");
         fn = sc.nextDouble();
        System.out.print("Enter the second number: ");
        sn = sc.nextDouble();
         temp = fn;
        fn = sn;
        sn = temp;
        System.out.println("First number: " + fn);
        System.out.println("Second number: " + sn);
    }
}
