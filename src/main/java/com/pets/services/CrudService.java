package com.pets.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pets.model.Pet;
import com.pets.repo.CrudRepo;

@Service
public class CrudService {

    @Autowired
    private CrudRepo repo;

    public List<Pet> fetchPetList() {
        return repo.findAll();
    }

    public Pet savePetToDB(Pet pet) {
        return repo.save(pet);
    }

    public Optional<Pet> fetchPetById(int id) {
        return repo.findById(id);
    }

    public String deletePetById(int id) {
        String result;
        try {
            repo.deleteById(id);
            result = "Pet successfully deleted";
        } catch (Exception e) {
            result = "Pet is not deleted";
        }
        return result;
    }
}
