package service;

import dto.BookRequest;
import dto.BookResponse;
import org.junit.jupiter.api.Test;
import type.BookResult;
import type.Category;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {
    LibraryService libraryService = new LibraryService(new Literature());
    @Test
    void Book_success() {
        //given
        BookRequest bookRequest = new BookRequest(Category.Literature, "munhak");
        //when
        BookResponse bookResponse = libraryService.useBook(bookRequest);
        //then
        assertEquals(BookResult.Success, bookResponse.getBookResult());
       }

}