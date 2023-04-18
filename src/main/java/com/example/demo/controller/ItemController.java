package com.example.demo.controller;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Items;
import com.example.demo.Repository.ItemRepo;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(value = {"/all" , "" , "/"})
    public List<Items> getALlEmp(){
        return itemService.getALlItems();
    }
    @GetMapping(value = "/id/{id}")
    public Items getEmpId(@PathVariable int id){
        return itemService.getItemId(id);
    }
    @PostMapping(value = "/add")
    public Items addEmp(@RequestBody Items item){
        return itemService.addItem(item);
//        return emp;
    }
    @GetMapping(value = "/type/{type}")
    public List<Items> getEmpName(@PathVariable String type)
    {
        List<Items> answer = new ArrayList<>();
        List<Items> items =  itemService.getALlItems();
        for (Items i:
                items) {
            if(i.getType() == type){
                answer.add(i);
            }
        }
        return answer;

    }
    @GetMapping(value = "/price/{price}")
    public List<Items> getEmpSalary(@PathVariable float price)
    {
        List<Items> answer = new ArrayList<>();
        List<Items> items =  itemService.getALlItems();
        for (Items i:
                items) {
            if(i.getPrice() == price){
                answer.add(i);
            }
        }
        return answer;

    }

    @DeleteMapping(value = "/id/{id}")
    public void deleteEmp(@PathVariable int id){

    }
}
