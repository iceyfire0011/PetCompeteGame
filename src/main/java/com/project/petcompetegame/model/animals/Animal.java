package com.project.petcompetegame.model.animals;


import com.project.petcompetegame.enums.Gender;
import lombok.Data;

@Data
public abstract class Animal{
    private double price;
    private String animalName;
    private Gender sex;
    private double healthStatus=100;

    public abstract double feed(double amountOfFoodInKg);
}
