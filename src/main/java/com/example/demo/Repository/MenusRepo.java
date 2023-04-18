package com.example.demo.Repository;

import com.example.demo.Model.Menus;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MenusRepo extends JpaRepository<Menus , Integer> {
}
