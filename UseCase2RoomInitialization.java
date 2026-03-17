public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("         BOOK MY STAY APP");
        System.out.println("   Hotel Booking Management System");
        System.out.println("           Version 2.1");
        System.out.println("====================================");

        // Create room objects
        Room singleRoom = new SingleRoom(5);
        Room doubleRoom = new DoubleRoom(3);
        Room suiteRoom = new SuiteRoom(2);

        // Static availability variables
        int singleRoomAvailability = 5;
        int doubleRoomAvailability = 3;
        int suiteRoomAvailability = 2;

        System.out.println("\nRoom Details and Availability:\n");

        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleRoomAvailability);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailability);
        System.out.println();

        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteRoomAvailability);
    }
}