package com.example.factorymethod.ConcreteProduct;

import com.example.factorymethod.Product.Monster;

public class Gelatinous extends Monster {
    public Gelatinous(String name, int upperExtremity, int lowerExtremity, boolean tail, String habitat, String type1, String type2){
        this.setName(name);
        this.setUpperExtremity(upperExtremity);
        this.setLowerExtremity(lowerExtremity);
        this.setBody("Gelatinous");
        this.setTail(tail);
        this.setHabitat(habitat);
        this.setType1(type1);
        this.setType2(type2);
        this.setLife((int) (Math.random() * 61) + 10);
        this.setForce(3);
        this.setDefense(1);
        this.setId((int)(Math.random() * 400) + 1);
    }
}
