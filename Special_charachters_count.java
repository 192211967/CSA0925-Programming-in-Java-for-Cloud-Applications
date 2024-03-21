import java.util.*;
class Special_charachters_count
{
public static void main(String arg[])
{
int scc=0,cc=0;
String str="Modi Birthday @ September 17, #&$% is the wishes code for him";
char ch;
int i;
String c="";
String sc="";
str=str.toLowerCase();
int n=str.length();
for(i=0;i<n;i++)
{
ch=str.charAt(i);
if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='^'||ch=='&'||ch=='*'||ch==','||ch==';')
{
sc+=ch+" ";
scc++;
}
else if (ch>='a' && ch<='z')
{
c+=ch+" ";
cc++;
}
}
System.out.println("NO OF SPECIAL CHARACHTERS ARE "+scc);
}
}


