package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BookingID;

    @Column(name = "TableNo")
    private int TableNo;

    @Column(name = "GuestFirstName")
    private String GuestFirstName;

    @Column(name = "GuestLastName")
    private String GuestLastName;

    @Column(name = "BookingSlot")
    private Date BookingSlot;

    @Column(name = "EmployeeID")
    private int EmployeeID;

    public void setBookingID(int bookingID) {
        BookingID = bookingID;
    }

    public void setTableNo(int tableNo) {
        TableNo = tableNo;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public void setBookingSlot(Date bookingSlot) {
        BookingSlot = bookingSlot;
    }

    public void setGuestFirstName(String guestFirstName) {
        GuestFirstName = guestFirstName;
    }

    public void setGuestLastName(String guestLastName) {
        GuestLastName = guestLastName;
    }

    public int getBookingID() {
        return BookingID;
    }

    public int getTableNo() {
        return TableNo;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public Date getBookingSlot() {
        return BookingSlot;
    }

    public String getGuestFirstName() {
        return GuestFirstName;
    }

    public String getGuestLastName() {
        return GuestLastName;
    }

}
