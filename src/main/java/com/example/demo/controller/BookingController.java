package com.example.demo.controller;

import com.example.demo.Model.Bookings;
import com.example.demo.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping(value = {"","/","/all"})
    public List<Bookings> getAll(){
        return bookingService.getAllBook();
    }
    @GetMapping(value = "/firstname")
    public List<Bookings> getAllFirstName(@PathVariable String firstName){
        return bookingService.getAllFirstName(firstName);
    }
    @GetMapping(value = "/slot")
    public List<Bookings> getAllBookingSlot(@PathVariable Date slot){
        return bookingService.getAllBookingSlot(slot);
    }
    @GetMapping(value = "/table")
    public List<Bookings> getAllTalbeNo(@PathVariable int tableNo){
        return bookingService.getAllTalbeNo(tableNo);
    }





}
