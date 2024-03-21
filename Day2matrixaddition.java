import java.util.*;

class Day2matrixaddition {
    public static void main(String arg[]) {
        int i, j;
        Scanner sc = new Scanner(System.in);

        // Input matrix A
        int a[][] = new int[2][2];
        System.out.println("Enter the values of matrix A:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        int b[][] = new int[2][2];
        System.out.println("Enter the values of matrix B:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix addition
        int c[][] = new int[2][2];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Displaying the result
        System.out.println("The addition of matrices is:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
