package com.pets.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pets.model.Pet;

public interface CrudRepo extends JpaRepository<Pet, Integer> {

}
