package com.javaguides.itemsspringbootapp.controller;


import com.javaguides.itemsspringbootapp.entity.items;
import com.javaguides.itemsspringbootapp.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/items")
public class controller {

    @Autowired
    private repository Repository;

    @GetMapping
    public List<items>getAllItems(){
        return Repository.findAll();
    }
@PostMapping
    public Object createItems(@RequestBody items Items){
        return Repository.save(Items);
}
}
