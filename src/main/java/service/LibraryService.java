package service;

import dto.ReadRequest;
import dto.BookResponse;
import type.ReadResult;

public class LibraryService{
    private final Read readAdepter = new Read();
    private final Rent rentAdepter = new Rent();

    public BookResponse readBook(ReadRequest readRequest, UseInterface useInterface){
        ReadResult readResult = useInterface.readBook(readRequest.getTitle());
        if(readResult == ReadResult.Use_Fail){
            return new BookResponse(ReadResult.Use_Fail, readRequest.getTitle());
        }
        return new BookResponse(ReadResult.Use_Success, readRequest.getTitle());
    }

}
