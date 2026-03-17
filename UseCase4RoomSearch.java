public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("           BOOK MY STAY APP");
        System.out.println("     Hotel Booking Management System");
        System.out.println("             Version 4.0");
        System.out.println("====================================");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Create search service
        RoomSearchService searchService = new RoomSearchService(inventory);

        // Guest searches available rooms
        searchService.searchAvailableRooms();
    }
}