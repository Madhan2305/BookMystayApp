public class c {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("           BOOK MY STAY APP");
        System.out.println("     Hotel Booking Management System");
        System.out.println("             Version 7.0");
        System.out.println("====================================");

        // Create reservation (using existing Reservation class)
        Reservation reservation = new Reservation("Abhi", "Single Room");

        // Add-On Service Manager (already defined in project)
        AddOnServiceManager manager = new AddOnServiceManager();

        // Add services to reservation
        manager.addService("R101", new AddOnService("Breakfast", 500));
        manager.addService("R101", new AddOnService("WiFi", 300));
        manager.addService("R101", new AddOnService("Airport Pickup", 700));

        // Display output
        System.out.println("\nAdd-On Service Selection");
        System.out.println("Reservation ID: " + reservation.getRoomType().replace(" ", "") + "-1");

        double totalCost = manager.calculateTotalCost("R101");

        System.out.println("Total Add-On Cost: " + totalCost);
    }
}