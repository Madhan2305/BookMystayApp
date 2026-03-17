
public class UseCase3RoomInventory {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("           BOOK MY STAY APP");
        System.out.println("     Hotel Booking Management System");
        System.out.println("             Version 3.1");
        System.out.println("====================================");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display inventory
        inventory.displayInventory();

        // Example availability check
        System.out.println("\nChecking Availability:");
        System.out.println("Single Room Available: " +
                inventory.getAvailability("Single Room"));

        // Example update
        System.out.println("\nUpdating Inventory...");
        inventory.updateAvailability("Single Room", 4);

        inventory.displayInventory();
    }
}