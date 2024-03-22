import java.util.Scanner;

 class ReverseAndAddPalindrome
 {
    public static void main(String arg[]) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input number: ");
        int num = sc.nextInt();
        int count = 0;
        while (true) 
{
            int reverse = reverseNumber(num);
            int sum = num + reverse;
            count++;
            
            int isPal = isPalindrome(sum);
            if (isPal == 1) 
{
                System.out.println("Palindrome found after " + count + " count: " + sum);
                break;
            } else if (isPal == 0) 
{
                num = sum;
            }
        }
        
        sc.close();
    }

    public static int reverseNumber(int n)
 {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    public static int isPalindrome(int n)
    {
        int reverse = reverseNumber(n);
        if (reverse == n) {
            return 1;
        } else {
            return 0;
        }
    }
}
