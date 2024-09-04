import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String userName;
    List<Book> bookList = new ArrayList<>();
    public int getId(){
        return userId;
    }

    public void setUser(int id){

        this.userId = id;
    }

    public List<Book> readBooks(List<Book> books){
        bookList.addAll(books);
        return bookList;
    }

}
