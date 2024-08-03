package com.example.library;

import dto.BookResponse;
import dto.ReadRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.LibraryService;
import service.Read;
import type.Category;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        ReadRequest readRequest = new ReadRequest(Category.Comic,"Onpice");

    }

}
