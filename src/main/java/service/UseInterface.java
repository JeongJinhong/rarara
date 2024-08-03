package service;

import type.ReadResult;
import type.ReturnResult;

public interface UseInterface {
    ReadResult readBook(String Title);
    ReturnResult returnBook(String Title);
}
