import java.util.*;
 class Day3LCM_GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the N avlue:");
        n=input.nextInt();
        System.out.print("Number 1:- ");
        int num1 = input.nextInt();
        System.out.print("Number 2:- ");
        int num2 = input.nextInt();
        int small = (num1<num2)?num1:num2;
        int count = 1,gcd=0;
        while(count<=small){
            if(num1%count==0 && num2%count==0){
                gcd = count;
            }
            count++;
        }
        int lcm = (num1*num2)/gcd;
        System.out.println("the GCD is:- "+gcd);
        System.out.println("the LCM is:- "+lcm);

    }
}