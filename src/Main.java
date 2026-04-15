import java.util.Scanner;

/**
 * USE CASE 11: Exception Handling
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("BOOKMYSTAY - USE CASE 11: EXCEPTION HANDLING");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of rooms to book: ");
            int rooms = sc.nextInt();

            if (rooms <= 0) {
                throw new IllegalArgumentException("Rooms must be greater than 0");
            }

            System.out.println("Rooms booked successfully: " + rooms);

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}