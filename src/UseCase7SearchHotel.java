import java.util.ArrayList;
import java.util.Scanner;

/**
 * USE CASE 7: Search Hotel
 */
public class UseCase7SearchHotel {

    public static void main(String[] args) {

        System.out.println("BOOKMYSTAY - USE CASE 7: SEARCH HOTEL");

        // Hotel list
        ArrayList<String> hotels = new ArrayList<>();
        hotels.add("Taj Hotel");
        hotels.add("Oberoi");
        hotels.add("ITC Grand");
        hotels.add("Radisson");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hotel name to search: ");
        String input = sc.nextLine();

        boolean found = false;

        for (String hotel : hotels) {
            if (hotel.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Hotel Found!");
        } else {
            System.out.println("Hotel Not Found!");
        }
    }
}