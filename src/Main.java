import java.util.*;

/**
 * USE CASE 12: Final Integration
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("BOOKMYSTAY - USE CASE 12: FINAL SYSTEM");

        Scanner sc = new Scanner(System.in);

        ArrayList<String> hotels = new ArrayList<>();
        hotels.add("Taj Hotel");
        hotels.add("Oberoi");
        hotels.add("ITC Grand");

        HashSet<String> bookings = new HashSet<>();

        try {
            System.out.println("\nAvailable Hotels:");
            for (String h : hotels) {
                System.out.println(h);
            }

            System.out.print("\nEnter hotel name to book: ");
            String choice = sc.nextLine();

            if (!hotels.contains(choice)) {
                throw new Exception("Hotel not found!");
            }

            if (bookings.contains(choice)) {
                throw new Exception("Already booked!");
            }

            bookings.add(choice);

            System.out.println("Booking successful!");

            // Payment
            System.out.println("Processing payment...");
            System.out.println("Payment successful!");

        } catch (Exception e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
}