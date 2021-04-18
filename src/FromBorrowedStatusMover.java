public class FromBorrowedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.BORROWED)) {
            switch (requestedStatus) {
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    break;
                case OVERDUED:
                    book.setStatus(Status.OVERDUED);
                    break;
                case BORROWED:
                    System.out.println("Книга уже имеет такой статус");
                    break;
                case AVAILABLE:
                    book.setStatus(Status.AVAILABLE);
                    break;
                // Статус BORROWED переходит на каждый из статусов,
                // но default нужен если мы захотим расширить нашу программу (добавятся новые статусы)
                default:
                    System.out.println("Перевод книги из статуса BORROWED в статус" + " " + requestedStatus + " " + "невозможен");
            }
        } else {
            System.out.println("Ошибка, это не мой статус");
        }

        System.out.println("Статус книги: " + book.getStatus());
    }
}