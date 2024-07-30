package service;

import type.Category;

public class Literature implements UseInterface {
    @Override
    public Category getCategory() {
        return Category.Literature;
    }

    @Override
    public String Rent(String title) {
        System.out.println("Literature 카테고리의" +title + "을 대여 하셨습니다. ");
        return title;
    }
}
