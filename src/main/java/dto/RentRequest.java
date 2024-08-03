package dto;

import type.Category;

public class RentRequest {
    Category category;
    String Title;

    public RentRequest(Category category, String title) {
        this.category = category;
        Title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
