package com.example.demo.Service;


import com.example.demo.Model.Bookings;
import com.example.demo.Model.Employee;
import com.example.demo.Repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    public List<Bookings> getAllBook(){
        List<Bookings> bookings = new ArrayList<>();
        for (Bookings b:
                bookingRepo.findAll()) {
            bookings.add(b);
        }
        return bookings;
    }

    public List<Bookings> getAllFirstName(String firstName){
        List<Bookings> bookings = new ArrayList<>();
        for (Bookings b:
                bookingRepo.findAll()) {
            if (b.getGuestFirstName() == firstName){

                bookings.add(b);
            }
        }
        return bookings;
    }
    public List<Bookings> getAllBookingSlot(Date slot){

        List<Bookings> bookings = new ArrayList<>();
        for (Bookings b:
                bookingRepo.findAll()) {
            if (b.getBookingSlot() == slot){

                bookings.add(b);
            }
        }
        return bookings;
    }

    public List<Bookings> getAllTalbeNo(int tableNo)
    {
        List<Bookings> bookings = new ArrayList<>();
        for (Bookings b:
                bookingRepo.findAll()) {
            if (b.getTableNo() == tableNo){

                bookings.add(b);
            }
        }
        return bookings;
    }

}
