package dto;

import type.ReadResult;

public class BookResponse {
    ReadResult readResult;
    String Title;

    public BookResponse(ReadResult readResult, String title) {
        this.readResult = readResult;
        Title = title;
    }

    public ReadResult getReadResult() {
        return readResult;
    }

    public void setReadResult(ReadResult readResult) {
        this.readResult = readResult;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}