package com.itwpsb.model;

public enum Unit {

    KILOGRAMS("kgs"), KILOGRAM("kg"), GRAMS("gms"), GRAM("gm"), LITRES("litres"), LITRE("litre"), MILLILITRES("millilitres"), MILLILITRE("millilitre");

    private String unit;

    private Unit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
}
