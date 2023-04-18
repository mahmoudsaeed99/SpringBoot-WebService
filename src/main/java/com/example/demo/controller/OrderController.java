package com.example.demo.controller;

import com.example.demo.Model.Bookings;
import com.example.demo.Model.Orders;
import com.example.demo.Service.BookingService;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = {"","/","/all"})
    public List<Orders> getAll(){

        return orderService.getAll();
    }
    @GetMapping(value = "/firstname")
    public List<Orders> getAllFirstName(@PathVariable int quantity){
        return orderService.getByQuantity(quantity);
    }
}
