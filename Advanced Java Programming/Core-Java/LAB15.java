import java.util.Scanner;
import java.io.*;
 
public class LAB15 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Employee ID   : "); String id      = sc.nextLine();
        System.out.print("Name          : "); String name    = sc.nextLine();
        System.out.print("Address       : "); String address = sc.nextLine();
        System.out.print("Date of Birth : "); String dob     = sc.nextLine();
        System.out.print("Phone Number  : "); String phone   = sc.nextLine();
 
        // Write to file
        try (PrintWriter pw = new PrintWriter(new FileWriter("Emp.txt"))) {
            pw.println("Employee ID  : " + id);
            pw.println("Name         : " + name);
            pw.println("Address      : " + address);
            pw.println("Date of Birth: " + dob);
            pw.println("Phone Number : " + phone);
        }
        System.out.println("\nData written to Emp.txt successfully.");
 
        // Read and display
        System.out.println("\n--- Contents of Emp.txt ---");
        try (BufferedReader br = new BufferedReader(new FileReader("Emp.txt"))) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        }
    }
}
