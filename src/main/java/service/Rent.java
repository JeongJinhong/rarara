package service;

import type.ReadResult;
import type.ReturnResult;

public class Rent implements UseInterface{



    @Override
    public ReadResult readBook(String Title) {
        if(Title == null || Title.isEmpty()){
            return ReadResult.Use_Fail;
        }
        return ReadResult.Use_Success;
    }

    @Override
    public ReturnResult returnBook(String Title) {
        if(Title == null || Title.isEmpty()){
            return ReturnResult.Return_Fail;
        }
        return ReturnResult.Return_Success;
    }
}
