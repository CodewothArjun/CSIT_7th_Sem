
import java.util.Scanner;

public class LAB2 {
    static void Check(int a){
        if(a%2==0){
            System.out.println("The given number is Even "+a);
        }else{
            System.out.println("The given number is Odd "+a);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Check(num);
    }
}

