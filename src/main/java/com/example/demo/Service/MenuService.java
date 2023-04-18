package com.example.demo.Service;


import com.example.demo.Model.Bookings;
import com.example.demo.Model.Menus;
import com.example.demo.Repository.MenusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenusRepo menusRepo;

    public List<Menus> getAll(){
        List<Menus> menus = new ArrayList<>();
        for (Menus m:
                menusRepo.findAll()) {
            menus.add(m);
        }
        return menus;
    }
    public List<Menus> getByCuisine(String cuisine){
        List<Menus> menus = new ArrayList<>();
        for (Menus m:
                menusRepo.findAll()) {
            if (m.getCuisine() == cuisine){

                menus.add(m);
            }
        }
        return menus;
    }

}
