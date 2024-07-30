package service;

import type.Category;

public class Novel implements UseInterface {
    @Override
    public Category getCategory() {
        return Category.Novel;
    }

    @Override
    public String Rent(String title){
        System.out.println("Novel 카테고리의" + title + "을 대여 하셨습니다.");
        return title;
    }
}
