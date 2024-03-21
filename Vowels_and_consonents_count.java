import java.util.*;
class Vowels_and_consonents_count
{
public static void main(String arg[])
{
int vc=0,cc=0;
String str="Saveetha School of Engineering";
char ch;
int i;
String v="";
String c="";
str=str.toLowerCase();
int n=str.length();
for(i=0;i<n;i++)
{
ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
v+=ch+" ";
vc++;
}
else if(ch>='a' && ch<='z')
{
c+=ch+"";
cc++;
}
}
System.out.println("NO OF VOWELS IS "+vc);
System.out.println("NO OF CONSONENTS IS "+cc);
}
}


