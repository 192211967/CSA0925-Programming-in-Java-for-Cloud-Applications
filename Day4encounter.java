import java.util.*;
class Day4encounter
{
   public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Input. enter -1 to stop");
     int num=0;
     float sum=0,sum1=0,avg,avg1;
     int pos=0,neg=0;
     while(num!=-1)
      {
         num=sc.nextInt();
         if(num>0)
          {
             pos++;
             sum=sum+num;
             
          }
         else if(num<-1)           
           {
              neg++;
              sum1=sum1+num;
            } 
} 
            avg=sum/pos;
            System.out.println("The average:"+avg);           
            avg1=(sum1)/neg;
             System.out.println("the avg of negat:"+avg1);
      
     
}
}
             