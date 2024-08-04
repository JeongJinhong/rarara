public class Library extends User{
    String  customerName;
    Book book = new Book();
    @Override
    public void JoinLibrary(String name) {
        customerName = name;
        System.out.println("Joined Library");
    }
    @Override
    public void ReadBook(String category, String bookTitle) {
        book.ReadBook(category, bookTitle);
    }

}
