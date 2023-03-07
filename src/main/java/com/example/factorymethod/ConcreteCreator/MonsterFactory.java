package com.example.factorymethod.ConcreteCreator;

import com.example.factorymethod.Creator.iCreator;
import com.example.factorymethod.Product.Monster;
import com.example.factorymethod.ConcreteProduct.*;

public class MonsterFactory implements iCreator {

    @Override
    public Monster createMonster(String name, int upperExtremity, int lowerExtremity, String body, boolean tail, String habitat, String type1, String type2) {


        switch (body.toLowerCase()){
            case "ethereal":
                return new Ethereal(name, upperExtremity, lowerExtremity,  tail, habitat, type1, type2);


            case "gelatinous":
                return new Gelatinous(name, upperExtremity, lowerExtremity,  tail, habitat, type1, type2);

            case "metal":
                return new Metal(name, upperExtremity, lowerExtremity,  tail, habitat, type1, type2);


            case "humanoid":
                return new Humanoid(name, upperExtremity, lowerExtremity,  tail, habitat, type1, type2);


            default:
                return new Scaly(name, upperExtremity, lowerExtremity,  tail, habitat, type1, type2);
        }
    }
}
