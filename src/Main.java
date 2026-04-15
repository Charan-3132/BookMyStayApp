import java.util.Scanner;

/**
 * USE CASE 10: Payment Simulation
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("BOOKMYSTAY - USE CASE 10: PAYMENT SYSTEM");

        Scanner sc = new Scanner(System.in);

        double amount = 5000;

        System.out.println("Booking Amount: ₹" + amount);

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Processing UPI Payment...");
                break;
            case 2:
                System.out.println("Processing Credit Card Payment...");
                break;
            case 3:
                System.out.println("Processing Debit Card Payment...");
                break;
            default:
                System.out.println("Invalid Payment Method!");
                return;
        }

        System.out.println("✅ Payment Successful!");
        System.out.println("Booking Confirmed 🎉");
    }
}