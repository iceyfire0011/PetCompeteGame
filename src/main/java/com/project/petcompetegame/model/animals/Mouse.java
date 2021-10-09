package com.project.petcompetegame.model.animals;

public class Mouse extends Animal{

    public Mouse(){
        this.setPrice(10);
    }

    @Override
    public double feed(double amountOfFoodInKg){
        return 0.1*amountOfFoodInKg;
    }
}
