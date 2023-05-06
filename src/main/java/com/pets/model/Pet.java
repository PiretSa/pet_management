package com.pets.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Pet {
    @Id
    private int id;
    private String name;
    private int code;
    private String type;
    private String fur;
    private String country;

    public Pet() {
    }

    public Pet(int id, String name, int code, String type, String fur, String country) {
        super();
        this.id = id;
        this.name = name;
        this.code = code;
        this.type = type;
        this.fur = fur;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
