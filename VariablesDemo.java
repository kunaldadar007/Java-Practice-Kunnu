package day1.Variables;

import java.util.Scanner;

public class VariablesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your account balance: ");
        double balance = sc.nextDouble();

        // Output
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: ₹" + balance);

        sc.close();
    }
}
