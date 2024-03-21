import java.util.*;

class Day2Pattern1 
{
    public static void main(String arg[])
    {
        int row, i, j, space = 1;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        space = row - 1;
        for (j = 1; j <= row; j++) 
      {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            for (i = 1; i <= j; i++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
            space--;
       }
        
        space = 1;
        for (j = row - 1; j >= 1; j--) 
     {
            for (i = 1; i <= space; i++) 
           {
                System.out.print(" ");
            }
            for (i = 1; i <= j; i++) 
            {
                System.out.print(j + " ");
            }
            System.out.println("");
            space++;
        }
    }
}
