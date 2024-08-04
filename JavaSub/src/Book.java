public class Book extends Library{
    @Override
    public void ReadBook(String category, String bookTitle) {
        System.out.println("Reading Book " + bookTitle);
    }
}
