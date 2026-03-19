import java.util.HashMap;

/**
 * BookMyStayApp
 *
 * Demonstrates centralized inventory management using HashMap.
 * Replaces scattered availability variables with a single source of truth.
 *
 * @author Charan
 * @version 1.0
 */

// Abstract Room Class
abstract class Room {

    protected String type;
    protected int beds;
    protected double price;

    public Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

// Room Types
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 1500);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 2500);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 5000);
    }
}

// Inventory Class (NEW)
class RoomInventory {

    private HashMap<String, Integer> availability;

    // Constructor initializes inventory
    public RoomInventory() {
        availability = new HashMap<>();

        availability.put("Single Room", 5);
        availability.put("Double Room", 3);
        availability.put("Suite Room", 2);
    }

    // Get availability
    public int getAvailability(String roomType) {
        return availability.getOrDefault(roomType, 0);
    }

    // Update availability
    public void updateAvailability(String roomType, int count) {
        availability.put(roomType, count);
    }

    // Display full inventory
    public void displayInventory() {
        System.out.println("\n--- Current Room Inventory ---");
        for (String key : availability.keySet()) {
            System.out.println(key + " → " + availability.get(key));
        }
    }
}

// Main Class
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to BookMyStay - Centralized Inventory");

        // Create room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display room details with availability
        System.out.println("\n--- Room Details ---");

        single.displayDetails();
        System.out.println("Available: " + inventory.getAvailability(single.getType()));

        System.out.println();

        doubleRoom.displayDetails();
        System.out.println("Available: " + inventory.getAvailability(doubleRoom.getType()));

        System.out.println();

        suite.displayDetails();
        System.out.println("Available: " + inventory.getAvailability(suite.getType()));

        // Show full inventory
        inventory.displayInventory();

        System.out.println("\nApplication Terminated");
    }
}