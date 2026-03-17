
public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("           BOOK MY STAY APP");
        System.out.println("     Hotel Booking Management System");
        System.out.println("             Version 8.0");
        System.out.println("====================================");

        // Booking history storage
        BookingHistory bookingHistory = new BookingHistory();

        // Simulating confirmed bookings (like Use Case 6 flow)
        bookingHistory.addBooking(new Reservation("Abhi", "Single"));
        bookingHistory.addBooking(new Reservation("Subha", "Double"));
        bookingHistory.addBooking(new Reservation("Vanmathi", "Suite"));

        // Generate report
        BookingReportService reportService = new BookingReportService();
        reportService.generateReport(bookingHistory.getHistory());
    }
}