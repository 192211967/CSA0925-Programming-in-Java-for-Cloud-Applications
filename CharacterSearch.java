import java.util.*;
class CharacterSearch 
{
	public static void main(String[] args) 
	{
       	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
        	String N = sc.nextLine();
			 int n=N.length();
	        System.out.print("Enter a character to search: ");
        	char searchChar = sc.next().charAt(0);
        	int index = -1; 
        	for (int i = 0; i < n; i++) 
		{
            		if (N.charAt(i) == searchChar) 
			        {
                		index = i; 
                		break; 
            		}
       }
       if (index != -1)
		{
           System.out.println("The character '" + searchChar + "' is present at index " + index);
        } 
		else 
		{
 System.out.println("The character '" + searchChar + "' is not present in the string.");
        }
}
}