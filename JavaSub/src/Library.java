public class Library extends User{
    String  customerName;
    BookServuce bookServuce = new BookServuce();
    @Override
    public void JoinLibrary(String name) {
        customerName = name;
        System.out.println("Joined Library");
    }
    @Override
    public void ReadBook(String category, String bookTitle) {
        bookServuce.ReadBook(category, bookTitle);
    }

}
