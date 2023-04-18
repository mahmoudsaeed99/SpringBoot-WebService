package com.example.demo.Repository;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ItemRepo extends JpaRepository<Items, Integer> {


}
