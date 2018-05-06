package com.itwpsb.model;

import java.util.List;

public class Bill {

    private int id;
    private Company company;
    private Customer customer;
    private List<Item> items;
    private double discount;
    private double amount;
}
