import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. 도서관 생성
        Library library = new Library();
        // 2. 도서관에 넣을 책들 생성
        Book comicBook1 = new Book(BookType.COMIC, 1, "comic1");
        library.addBook(comicBook1);
        Book comicBook2 =new Book(BookType.COMIC, 2, "comic2");
        library.addBook(comicBook2);
        Book comicBook3 =new Book(BookType.COMIC, 3, "comic3");
        library.addBook(comicBook3);

        Book eduBook1 =new Book(BookType.EDU, 11, "edu1");
        library.addBook(eduBook1);
        Book eduBook2 =new Book(BookType.EDU, 12, "edu2");
        library.addBook(eduBook2);
        Book eduBook3 =new Book(BookType.EDU, 13, "edu3");
        library.addBook(eduBook3);

        // 3. 책을 빌릴 유저 생성
        User user = new User();
        user.setUser(101);

        // 4. 도서관에서 책을 N 개 + 여러 타입의 책 빌림(특정타입의 리스트)
        // + 특정타입을 넣으면 도서관에서 빌려줄수 있는 해당 타입의 책들을 출력
        List<Book> searchComicList = library.getCategoryBooks(BookType.COMIC);
        for (Book book : searchComicList) {
            System.out.println("search : " + book.getId() + " : " + book.getTitle());
        }
        List<Integer> bookList = new ArrayList<>();
        for (Book book : searchComicList) {
            bookList.add(book.getId());
        }
        bookList.add(12);
        //List<Book> RentBookList = library.rent(user.getId(), bookList);
        library.rent(user.getId(), bookList);

        // 5. 빌린 책을 유저가 read
        //List<Book> returnList = user.readBooks(RentBookList);-일부만 보도록 수정
        List<Book> readList = new ArrayList<>();
        readList.add(comicBook2);
        List<Book> returnList = user.readBooks(readList);

        // 6. 다보고 해당책을 다시 반납
        // 7. 제대로 반납되었는지 체크(라이브러리의 리스트 북 겟아이디)
        library.returnBooks(user.getId(), returnList);

//        Book book = new Book();
//        String  userId = "";
//        List<String> books = new ArrayList<>();
//        books.add("title");
//        String title = "title";
//
//        book.setTitle(title);
//        library.addBook(book);
//        library.rent(userId, books);
    }
}