import java.util.*;

class Octal {
    public static void main(String arg[]) {
        int i = 1, j=1,dec, oct = 0, bin = 0, num, X,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        num = sc.nextInt();
X=num;
        while (num != 0) {
            rem = num % 8;
            oct = oct + i * rem;
            num = num / 8;
            i = i * 10;
        }
        System.out.println("Octal num: " + oct);

        // Reset i before converting to binary
               // Convert to binary
        while (X != 0) {
            rem = X % 2;
            bin = bin + j * rem;
            X = X / 2;
            j = j * 10;
        }
        System.out.println("Binary num: " + bin);
    }
}
