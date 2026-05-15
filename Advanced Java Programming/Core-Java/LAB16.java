import java.io.*;
import java.util.Scanner;

public class LAB16 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name    : ");
        String name = sc.nextLine();
        System.out.print("Age             : ");
        String age = sc.nextLine();
        System.out.print("Grade           : ");
        String grade = sc.nextLine();
        System.out.print("Contact Number  : ");
        String contact = sc.nextLine();

        // Step 1: Write (append) to std.txt
        try (PrintWriter pw = new PrintWriter(new FileWriter("std.txt", true))) {
            pw.println("------------------------");
            pw.println("Name   : " + name);
            pw.println("Age    : " + age);
            pw.println("Grade  : " + grade);
            pw.println("Contact: " + contact);
        }
        System.out.println("Written to std.txt");

        // Step 2: Copy std.txt → std1.txt (overwrite is fine here)
        try (BufferedReader br = new BufferedReader(new FileReader("std.txt"));
                PrintWriter pw = new PrintWriter(new FileWriter("std1.txt"))) {
            String line;
            while ((line = br.readLine()) != null)
                pw.println(line);
        }
        System.out.println("Copied to std1.txt");

        // Step 3: Display std1.txt
        System.out.println("\n--- Contents of std1.txt ---");
        try (BufferedReader br = new BufferedReader(new FileReader("std1.txt"))) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        }
    }
}