public class LAB5 {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) evenSum += i;
            else            oddSum  += i;
        }
        System.out.println("Sum of Even numbers (1-100) = " + evenSum);
        System.out.println("Sum of Odd  numbers (1-100) = " + oddSum);
    }

}
