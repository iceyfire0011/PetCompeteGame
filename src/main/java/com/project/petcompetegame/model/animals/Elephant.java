package com.project.petcompetegame.model.animals;

public class Elephant extends Animal{

    public Elephant(){
        this.setPrice(100);
    }

    @Override
    public double feed(double amountOfFoodInKg){
        return 10*amountOfFoodInKg;
    }
}
