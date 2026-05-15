import java.util.Scanner;

public class LAB9 {
    static void print(int[][] m) {
        for (int[] row : m) {
            for (int v : row)
                System.out.printf("%5d", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = sc.nextInt();
        System.out.print("Columns: ");
        int c = sc.nextInt();
        int[][] A = new int[r][c], B = new int[r][c], C = new int[r][c];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();


        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                C[i][j] = A[i][j] + B[i][j];
            
        System.out.println("Matrix A:");
        print(A);
        System.out.println("Matrix B:");
        print(B);
        System.out.println("Sum (A+B):");
        print(C);
    }
}
