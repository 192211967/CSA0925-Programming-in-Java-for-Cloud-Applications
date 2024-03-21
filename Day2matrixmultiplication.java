import java .util.*;
class Day2matrixmultiplication
{
   public static void main(String arg[])
    {
      int i,j,k;
      Scanner sc=new Scanner(System.in);
      int a[][]=new int[2][2];
      System.out.println("Enter the values of a:");
      for(i=0;i<2;i++)
       {
         for(j=0;j<2;j++)
           {
             a[i][j]=sc.nextInt();
            }
       }
     int b[][]=new int[2][2];
     System.out.println("Enter the values of b:");
     for(i=0;i<2;i++)
     {
       for(j=0;j<2;j++)
        {
          b[i][j]=sc.nextInt();
        }
     }
    int c[][]=new int[2][2];
    for(i=0;i<2;i++)
      {
         for(j=0;j<2;j++)
            {
              for(k=0;k<2;k++)
               {
                   c[i][j]+=a[i][k]*b[k][j];
               }
             }
      }
    System.out.println("the multiplication of matrix is:");
    for(i=0;i<2;i++)
       {
          for(j=0;j<2;j++)
            {
              System.out.println(c[i][j]+" ");
            }
          System.out.println();
       }
   }

}