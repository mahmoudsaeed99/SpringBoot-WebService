package com.example.demo.controller;

import com.example.demo.Model.Menus;
import com.example.demo.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenusController {

    @Autowired
    private MenuService menuService;

    @GetMapping(value = {"","/","/all"})
    public List<Menus> getAll(){
        return menuService.getAll();
    }

    @GetMapping(value = {"/cuisine"})
    public List<Menus> getByCuisine(@PathVariable String cuisine){
        return menuService.getByCuisine(cuisine);
    }

}
