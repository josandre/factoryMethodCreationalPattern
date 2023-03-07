package com.example.factorymethod.ConcreteProduct;

import com.example.factorymethod.Product.Monster;

public class Humanoid extends Monster {

    public Humanoid(String name, int upperExtremity, int lowerExtremity, boolean tail, String habitat, String type1, String type2){
        this.setName(name);
        this.setUpperExtremity(upperExtremity);
        this.setLowerExtremity(lowerExtremity);
        this.setBody("Humanoid");
        this.setTail(tail);
        this.setHabitat(habitat);
        this.setType1(type1);
        this.setType2(type2);
        this.setLife((int) (Math.random() * 41) + 50);
        this.setForce(4);
        this.setDefense(3);
        this.setId((int)(Math.random() * 400) + 1);
    }

}
