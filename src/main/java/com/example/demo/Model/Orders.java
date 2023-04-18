package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID;

    @Column(name = "TableNo")
    private int TableNo;

    @Column(name = "MenuID")
    private int MenuID;

    @Column(name = "BookingID")
    private int BookingID;

    @Column(name = "BillAmount")
    private int BillAmount;

    @Column(name = "Quantity")
    private int Quantity;

    public void setMenuID(int menuID) {
        MenuID = menuID;
    }

    public void setTableNo(int tableNo) {
        TableNo = tableNo;
    }

    public void setBookingID(int bookingID) {
        BookingID = bookingID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public void setBillAmount(int billAmount) {
        BillAmount = billAmount;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getMenuID() {
        return MenuID;
    }

    public int getTableNo() {
        return TableNo;
    }

    public int getBookingID() {
        return BookingID;
    }

    public int getBillAmount() {
        return BillAmount;
    }

    public int getOrderID() {
        return OrderID;
    }

    public int getQuantity() {
        return Quantity;
    }
}
