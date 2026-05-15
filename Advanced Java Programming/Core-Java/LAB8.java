import java.util.Scanner;
public class LAB8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Ascending Order (already sorted)
        System.out.print("Ascending Order:  ");
        for (int x : arr) System.out.print(x + " ");

        // Descending Order (reverse)
        System.out.print("\nDescending Order: ");
        for (int i = n - 1; i >= 0; i--) System.out.print(arr[i] + " ");

        System.out.println();
        sc.close();
    }
}
