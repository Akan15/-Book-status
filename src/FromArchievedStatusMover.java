public class FromArchievedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.ARCHIVED)) {
            switch (requestedStatus) {
                case AVAILABLE:
                    book.setStatus(Status.AVAILABLE);
                    break;
                case ARCHIVED:
                    System.out.println("Книга уже имеет такой статус");
                    break;
                default:
                    System.out.println("Перевод книги из статуса ARCHIVED в статус" + " " + requestedStatus + " " + "невозможен");
            }
        } else {
            System.out.println("Ошибка, это не мой статус");
        }

        System.out.println("Статус книги: " + book.getStatus());
    }
}