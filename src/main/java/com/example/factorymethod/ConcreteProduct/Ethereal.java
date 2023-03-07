package com.example.factorymethod.ConcreteProduct;

import com.example.factorymethod.Product.Monster;

public class Ethereal extends Monster {


    public Ethereal(String name, int upperExtremity, int lowerExtremity, boolean tail, String habitat, String type1, String type2){
        this.setName(name);
        this.setUpperExtremity(upperExtremity);
        this.setLowerExtremity(lowerExtremity);
        this.setBody("Ethereal");
        this.setTail(tail);
        this.setHabitat(habitat);
        this.setType1(type1);
        this.setType2(type2);
        this.setForce(4);
        this.setDefense(1);
        this.setLife((int) (Math.random() * 100) + 1);
        this.setId((int)(Math.random() * 400) + 1);
    }

}
