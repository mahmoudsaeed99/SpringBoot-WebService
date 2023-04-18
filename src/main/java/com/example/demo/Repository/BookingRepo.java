package com.example.demo.Repository;

import com.example.demo.Model.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Bookings , Integer> {
}
