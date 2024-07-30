package dto;

import type.BookResult;

public class BookResponse {
    BookResult bookResult;
    String Title;

    public BookResponse(BookResult bookResult, String title) {
        this.bookResult = bookResult;
        Title = title;
    }

    public BookResult getBookResult() {
        return bookResult;
    }

    public void setBookResult(BookResult bookResult) {
        this.bookResult = bookResult;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
