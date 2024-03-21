import java.util.*;

class Until {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input. Enter * to stop");
        char c = '0';
        int lower = 0, upper = 0, digit = 0;
        while (c != '*') 
		{
            c = sc.next().charAt(0);
            if (c >= 'A' && c <= 'Z') 
			{
                upper++;
            } else if (c >= 'a' && c <= 'z') 
			{
                lower++;
            } else if (c >= '0' && c <= '9') 
			{
                digit++;
            }
           
        }
		 System.out.println("Lower:" + lower);
            System.out.println("Upper:" + upper);
            System.out.println("Numbers:" + digit);
    }
}
