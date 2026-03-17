public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("           BOOK MY STAY APP");
        System.out.println("     Hotel Booking Management System");
        System.out.println("             Version 5.0");
        System.out.println("====================================");

        BookingRequestQueue requestQueue = new BookingRequestQueue();

        // Guests submit booking requests
        requestQueue.addRequest(new Reservation("Alice", "Single Room"));
        requestQueue.addRequest(new Reservation("Bob", "Double Room"));
        requestQueue.addRequest(new Reservation("Charlie", "Suite Room"));

        // Display queue
        requestQueue.displayQueue();
    }
}