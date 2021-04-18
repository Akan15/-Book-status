public class Main {
    public static void main(String[] args) {
        Book book = new Book("The throne");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();

        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        fromArchievedStatusMover.moveToStatus(book, Status.OVERDUED);
        fromArchievedStatusMover.moveToStatus(book, Status.AVAILABLE);
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUED);
        fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
    }
}