package com.example.factorymethod.Creator;

import com.example.factorymethod.Product.Monster;

public interface iCreator {
    public Monster createMonster(String name, int upperExtremity, int lowerExtremity, String body, boolean tail, String habitat, String type1, String type2);
}
