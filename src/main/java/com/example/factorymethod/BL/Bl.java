package com.example.factorymethod.BL;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import DAO.DAOMonster;
import com.example.factorymethod.ConcreteCreator.MonsterFactory;
import com.example.factorymethod.Product.Monster;
import org.json.JSONArray;
import org.json.JSONObject;

public class Bl {
    private static Bl instanciaBl;
     private static MonsterFactory monsterFactory;

    private Bl(){
        monsterFactory = new MonsterFactory();
    }

    private DAOMonster daoMonster = new DAOMonster();

    private Monster curentMonster;

    public static Bl getInstanciaBl() {
        if (instanciaBl == null) {
            instanciaBl = new Bl();
        }
        return instanciaBl;
    }

    public void readJSONFile(String path) throws IOException {
        String json = Files.readString(Paths.get(path));
        JSONArray objects = new JSONArray(json);
       addMonstersFromJSONFile(objects);

    }

    private ArrayList<Monster> addMonstersFromJSONFile(JSONArray objects){

        for (int i = 0; i < objects.length(); i++)
        {
            JSONObject object = objects.getJSONObject(i);
            String name = object.getString("name");
            int upperExtremity = object.getInt("upperExtremity");
            String habitat = object.getString("habitat");
            String type2 = object.getString("type2");
            int lowerExtremity = object.getInt("lowerExtremity");
            String tailValue = object.getString("tail");
            String body = object.getString("body");
            String type1 = object.getString("type1");
            boolean tail = tailValue.equalsIgnoreCase("yes") ? true : false;

            Monster monster = monsterFactory.createMonster(name,upperExtremity, lowerExtremity, body, tail, habitat, type1, type2);
            daoMonster.getDataBase().add(monster);
        }

        return daoMonster.getDataBase();
    }

    public ArrayList<Monster> getMonsters(){
        return daoMonster.getDataBase();
    }

    public Monster getMonsterById(int id){
        return this.curentMonster = daoMonster.getMonsterById(id);
    }

    public Monster getCurrentMonster(){
        return this.curentMonster;
    }




}
