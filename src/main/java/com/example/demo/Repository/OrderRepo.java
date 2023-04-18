package com.example.demo.Repository;

import com.example.demo.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders , Integer> {
}
