package com.example.demo.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Items;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ItemService {

    @Autowired
    private ItemRepo itemRepo;

    public List<Items> getALlItems(){
        List<Items> items = new ArrayList<>();
        for (Items i:
                itemRepo.findAll()) {
            items.add(i);
        }
        return items;
    }

    public Items getItemId(int id){
        return itemRepo.findById(id).get();
    }

    public Items addItem(Items item){
        return itemRepo.save(item);
    }

    public void deleteEmp(int id){
        itemRepo.deleteById(id);
        return;
    }
}
