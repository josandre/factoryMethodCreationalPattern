package com.example.factorymethod.ConcreteProduct;


import com.example.factorymethod.Product.Monster;

public class Scaly extends Monster {

    public Scaly(String name, int upperExtremity, int lowerExtremity, boolean tail, String habitat, String type1, String type2){
        this.setName(name);
        this.setUpperExtremity(upperExtremity);
        this.setLowerExtremity(lowerExtremity);
        this.setBody("Scaly");
        this.setTail(tail);
        this.setHabitat(habitat);
        this.setType1(type1);
        this.setType2(type2);
        this.setLife((int) (Math.random() * 56) + 25);
        this.setForce(3);
        this.setDefense(3);
        this.setId((int)(Math.random() * 400) + 1);
    }
}
