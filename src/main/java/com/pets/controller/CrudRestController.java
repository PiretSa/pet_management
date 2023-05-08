package com.pets.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pets.model.Pet;
import com.pets.services.CrudService;


@RestController
public class CrudRestController {
    @Autowired
    private CrudService service;

    @GetMapping("/getpetlist")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Pet> fetchPetList() {

        List<Pet> pets = new ArrayList<Pet>();

        // Logic to fetch list from database
        pets = service.fetchPetList();

        return pets;
    }

    @PostMapping("/addpet")
    @CrossOrigin(origins = "http://localhost:4200")
    public Pet savePet(@RequestBody Pet pet) {

        return service.savePetToDB(pet);
    }

    @GetMapping("/getpetbyid/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Pet fetchPetById(@PathVariable int id) {

        return service.fetchPetById(id).get();
    }

//    @GetMapping("/editpet")
//    @CrossOrigin(origins = "http://localhost:4200")
//    public String updatePet(@RequestBody Pet pet) {
//        return service.editPet();
//    }

    @DeleteMapping("/deletepetbyid/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public String deletePetById(@PathVariable int id) {

        return service.deletePetById(id);
    }
}
