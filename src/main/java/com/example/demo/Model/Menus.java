package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
public class Menus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MenuID;

    @Column(name = "ItemID")
    private int ItemID;

    @Column(name = "Cuisine")
    private String Cuisine;

    public void setItemID(int itemID) {
        ItemID = itemID;
    }

    public void setMenuID(int menuID) {
        MenuID = menuID;
    }

    public int getItemID() {
        return ItemID;
    }

    public int getMenuID() {
        return MenuID;
    }

    public String getCuisine() {
        return Cuisine;
    }
}

