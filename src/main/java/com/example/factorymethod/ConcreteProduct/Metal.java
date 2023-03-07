package com.example.factorymethod.ConcreteProduct;

import com.example.factorymethod.Product.Monster;

public class Metal extends Monster {
    public Metal(String name, int upperExtremity, int lowerExtremity, boolean tail, String habitat, String type1, String type2){
        this.setName(name);
        this.setUpperExtremity(upperExtremity);
        this.setLowerExtremity(lowerExtremity);
        this.setBody("Metal");
        this.setTail(tail);
        this.setHabitat(habitat);
        this.setType1(type1);
        this.setType2(type2);
        this.setLife((int) (Math.random() * 41) + 40);
        this.setForce(5);
        this.setDefense(2);
        this.setId((int)(Math.random() * 400) + 1);
    }
}
