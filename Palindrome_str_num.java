import java.util.*;
class Palindrome_str_num {
    public static void main(String arg[])
	{
       Scanner sc=new Scanner(System.in);
	   int c=1;
	   System.out.println("ENTER THE CASE ");
	   c= sc.nextInt();
	   switch(c)
{
case 1:
{
String str="MADAM";
String rev="";
char ch;
int i;
int l=str.length();
for(i=l-1;i>=0;i--)
{
ch=str.charAt(i);
rev=rev+ch;
}
if(str.equals(rev))
{
        System.out.println("GIVEN STRING IS A PALINDROME");
}
else 
{
        System.out.println("GIVEN STRING IS NOT A PALINDROME");
}
break;
}
case 2:
{
 int n, temp, rem, rev1 = 0, sum = 0;
        System.out.println("ENTER THE NUMBER");
        n = sc.nextInt();
        temp = n;
        while (n != 0)
			{
            rem = n % 10;
            rev1 = rev1 * 10 + rem;
            n = n / 10;
			}
			if(temp==rev1)
{
        System.out.println(+temp+" IS A PALINDROME");
}
       else 
{
        System.out.println(+temp+"  STRING IS NOT A PALINDROME");
}
break;
}
default :
{
	        System.out.println("ERROR! SELECT ONLY CHOICE 1 OR 2");
}
}
}
}
			