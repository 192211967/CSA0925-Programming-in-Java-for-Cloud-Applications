import java.util.*;
class Day4_count
{
public static void main(String arg[])
{
  int pricount=0,comcount=0,count=0,i,j,n;
  int arr[]={2,34,54,21,45,23};
  n=arr.length;
  for(i=0;i<n;i++)
   {
     for(j=2;j<=arr[i];j++)
     {
       if(arr[i]%j==0)
       count++;
     }
     if(count>1)
      {
         comcount++;
       }
     else
       {
         pricount++;
       }
    }
   System.out.println("Number of prime numbers:"+pricount);
   System.out.println("Number of composite numbers:"+comcount);
  }
}
       
  