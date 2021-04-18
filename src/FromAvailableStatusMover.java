public class FromAvailableStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.AVAILABLE)) {
            switch (requestedStatus) {
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    break;
                case BORROWED:
                    book.setStatus(Status.BORROWED);
                    break;
                case AVAILABLE:
                    System.out.println("Книга уже имеет такой статус");
                    break;
                default:
                    System.out.println("Перевод книги из статуса AVAILABLE в статус" + " " + requestedStatus + " " + "невозможен");
            }
        } else {
            System.out.println("Ошибка, это не мой статус");
        }

        System.out.println("Статус книги: " + book.getStatus());
    }
}