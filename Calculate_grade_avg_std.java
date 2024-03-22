import java.util.*;
class Calculate_grade_avg_std
{
	public static void main(String arg[])
	{
		float s1,s2,s3,s4,avg,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE marks in Python ");
		s1=sc.nextFloat();
		System.out.println("ENTER THE marks in c programing ");
		s2=sc.nextFloat();
		System.out.println("ENTER THE marks in mathamatics ");
		s3=sc.nextFloat();
		System.out.println("ENTER THE marks in physics ");
		s4=sc.nextFloat();
		sum=s1+s2+s3+s4;
		avg=sum/4;
		System.out.println("SUM IS "+sum);
	    System.out.println("Aggrigate is  "+avg);
         if(avg>=75)
		 {
		 	    System.out.println("Distinction");
		}
	else if(avg>=60 && avg<75 )
		 {
		 	    System.out.println("First Division");
		}
		else if(avg>=50 && avg<60 )
		 {
		 	    System.out.println("Second Division");
		}
		else if(avg>=40 && avg<50 )
		 {
		 	    System.out.println("Third Division");
		}
		else
		 {
		 	    System.out.println("FAIL");
		}
	}
}