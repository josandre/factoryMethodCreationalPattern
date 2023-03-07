package DAO;

import com.example.factorymethod.Product.Monster;

import java.util.ArrayList;

public class DAOMonster {
    private ArrayList<Monster> monsters = new ArrayList<>();

    public ArrayList<Monster> getDataBase(){
        return this.monsters;
    }

    public Monster getMonsterById(int id){

        for (int i = 0; i < this.monsters.size(); i++){
            if(this.monsters.get(i).getId() == id){
                return this.monsters.get(i);
            }
        }

        return null;
    }

}
