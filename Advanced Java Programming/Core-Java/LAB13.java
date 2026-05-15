public class LAB13 {
    public static void main(String[] args) {

        // Test 1: ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block 1 executed.\n");
        }

        // Test 2: ArrayIndexOutOfBoundsException
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block 2 executed.\n");
        }

        // Test 3: NumberFormatException
        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } finally {
            System.out.println("Finally block 3 executed.\n");
        }

        // Test 4: Multi-catch with | operator
        try {
            String s = null;
            s.length();
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Multi-catch: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Finally block 4 executed.");
        }
    }
}
