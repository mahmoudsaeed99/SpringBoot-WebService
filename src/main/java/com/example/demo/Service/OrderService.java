package com.example.demo.Service;

import com.example.demo.Model.Menus;
import com.example.demo.Model.Orders;
import com.example.demo.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public List<Orders> getAll(){
        List<Orders> order = new ArrayList<>();
        for (Orders o:
                orderRepo.findAll()) {
            order.add(o);
        }
        return order;
    }
    public List<Orders> getByQuantity(int quantity){
        List<Orders> order = new ArrayList<>();
        for (Orders o:
                orderRepo.findAll()) {
            if (o.getQuantity() == quantity){

                order.add(o);
            }
        }
        return order;
    }


}
