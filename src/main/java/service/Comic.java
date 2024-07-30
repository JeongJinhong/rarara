package service;

import type.Category;

public class Comic implements UseInterface {
    @Override
    public Category getCategory() {
        return Category.Comic;
    }

    @Override
    public String Rent(String title){
        System.out.println("Comic 카테고리의" + title + "을 대여 하셨습니다.");
        return title;
    }
}
