import java.util.*;
class Reverse_word
{
public static void main(String arg[])
{
String str="TEMPLE";
String rev=" ";
char ch;
int i;
int l=str.length();
for(i=l-1;i>=0;i--)
{
ch=str.charAt(i);
rev=rev+ch;
}
System.out.println("REVERSE A STRING IS "+rev);
}
}