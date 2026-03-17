import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("           BOOK MY STAY APP");
        System.out.println("     Hotel Booking Management System");
        System.out.println("             Version 6.0");
        System.out.println("====================================");

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Booking queue
        BookingRequestQueue requestQueue = new BookingRequestQueue();

        requestQueue.addRequest(new Reservation("Alice", "Single Room"));
        requestQueue.addRequest(new Reservation("Bob", "Double Room"));
        requestQueue.addRequest(new Reservation("Charlie", "Suite Room"));

        // Room allocation tracking
        Map<String, Set<String>> allocatedRooms = new HashMap<>();

        // Process requests in FIFO order
        Queue<Reservation> queue = requestQueue.getQueue();

        while (!queue.isEmpty()) {

            Reservation reservation = queue.poll();

            String roomType = reservation.getRoomType();
            String guestName = reservation.getGuestName();

            int available = inventory.getAvailability(roomType);

            if (available > 0) {

                // Generate unique room ID
                String roomId = roomType.replace(" ", "") + "-" + available;

                allocatedRooms.putIfAbsent(roomType, new HashSet<>());

                Set<String> roomSet = allocatedRooms.get(roomType);

                if (!roomSet.contains(roomId)) {

                    roomSet.add(roomId);

                    // update inventory
                    inventory.updateAvailability(roomType, available - 1);

                    System.out.println("\nReservation Confirmed!");
                    System.out.println("Guest: " + guestName);
                    System.out.println("Room Type: " + roomType);
                    System.out.println("Room ID: " + roomId);
                }

            } else {

                System.out.println("\nReservation Failed (No Availability)");
                System.out.println("Guest: " + guestName);
                System.out.println("Room Type: " + roomType);
            }
        }

        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();
    }
}