package com.no3.epos.menu;

public class Item {
    private String id;
    private String name;
    private int price;
    private boolean customisable;

    public Item(String id, String name, int price, boolean customsiable){
        this.id = id;
        this.name = name;
        this.price = price;
        this.customisable = customsiable;
    }
}
