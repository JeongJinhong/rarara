package service;

import dto.BookRequest;
import dto.BookResponse;
import type.BookResult;
import type.Category;

public class LibraryService {
    private UseInterface useInterface;
    public LibraryService(UseInterface use) {
        useInterface = use;
    }
    public BookResponse useBook(BookRequest bookRequest){
        String bookTitle = useInterface.Rent(bookRequest.getTitle());
        return new BookResponse(BookResult.Success, bookTitle);
    }
}
