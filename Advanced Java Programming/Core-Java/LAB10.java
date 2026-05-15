import java.util.Scanner;

public class LAB10 {
    static void print(int[][] m) {
        for (int[] row : m) {
            for (int v : row)
                System.out.printf("%6d", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows of A (m): ");
        int m = sc.nextInt();
        System.out.print("Cols of A / Rows of B (n): ");
        int n = sc.nextInt();
        System.out.print("Cols of B (p): ");
        int p = sc.nextInt();

        int[][] A = new int[m][n], B = new int[n][p], C = new int[m][p];
        System.out.println("Enter Matrix A (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B (" + n + "x" + p + "):");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < p; j++)
                B[i][j] = sc.nextInt();


        for (int i = 0; i < m; i++)
            for (int j = 0; j < p; j++)
                for (int k = 0; k < n; k++)
                    C[i][j] += A[i][k] * B[k][j];
                
        System.out.println("Product A x B:");
        print(C);
    }
}
