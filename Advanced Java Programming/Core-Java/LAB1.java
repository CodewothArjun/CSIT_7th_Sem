import java.util.*;
public class LAB1 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Operations opr = new Operations();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        opr.sum(num1, num2);
        opr.product(num1,num2);
        opr.quotient(num1,num2);
        opr.remainder(num1,num2);
        opr.average(num1, num2);
        
    }
    
}

class Operations{
    void sum(int a, int b){
        System.out.println("Sum: "+ (a+b));
    }
    void product(int a, int b){
        System.out.println("Product: "+ (a*b));
    }
    void quotient(int a, int b){
        System.out.println("Divide: "+ (a/b));
    }
    void remainder(int a, int b){
        System.out.println("Rem: "+ (a%b));
    }
    void average(int a, int b){
        System.out.println("Avg: "+ (a+b)/2);
    }
}
