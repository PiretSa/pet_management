package com.pets.controller;

import org.springframework.web.bind.annotation.RestController;
import com.pets.model.Pet;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CrudRestController {
    public List<Pet> fetchPetList() {
        List<Pet> pets = new ArrayList<Pet>();

        // Logic to fetch list from database


        return pets;
    }
}
