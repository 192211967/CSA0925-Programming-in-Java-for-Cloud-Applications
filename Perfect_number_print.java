import java.util.*;
class Perfect_number_print
 {
    public static void main(String arg[]) 
	{
        int n = 1,i,sum,c=0,N;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE value of N");
        N = sc.nextInt();
		System.out.println("PERFECT NUMBER: ");
        while (c<N)
			{
				sum=0;
            for (i=1;i<=n/2;i++) 
			{
                if(n%i==0) 
				{
                    sum=sum+i;
                }
            }
            if(sum==n)
				{
                 System.out.print(" " +n);
                 c++;
                }
            n++;
        }
    }
}
