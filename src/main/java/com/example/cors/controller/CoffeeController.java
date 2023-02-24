package com.example.cors.controller;

import com.example.cors.modul.Coffee;
import com.example.cors.modul.Size;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/coffee")

public class CoffeeController {

    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
       coffeeList.add(new Coffee(1,"Americana", Size.L ));
       coffeeList.add(new Coffee(2,"Capuccino", Size.M ));
       coffeeList.add(new Coffee(3,"Mortora", Size.XS ));
    }

    @GetMapping
    public List<Coffee> findAll(){
        return coffeeList;
    }


}
