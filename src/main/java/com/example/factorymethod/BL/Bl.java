package com.example.factorymethod.BL;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Bl {
    private static Bl instanciaBl;

    private Bl(){}

    public static Bl getInstanciaBl() {
        if (instanciaBl == null) {
            instanciaBl = new Bl();
        }
        return instanciaBl;
    }

    public void readJSONFile(String path){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ArrayList monsters = objectMapper.readValue(new File(path), ArrayList.class);
            System.out.println(monsters.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
