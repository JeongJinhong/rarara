public class User {
    private String name;

    public void JoinLibrary(String name){
        Library lib = new Library();
        lib.JoinLibrary(name);
    }

    public void ReadBook(String category, String bookTitle){
        Library lib = new Library();
    }


}
