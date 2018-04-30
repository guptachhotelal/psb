package com.itwpsb.model;

public enum Category {
    CHEMICAL("Chemical");

    private String category;

    private Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
