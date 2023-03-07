package com.example.factorymethod.Model;

public class Monster {
    private String name;
    private int upperExtremity;
    private int lowerExtremity;
    private String body;
    private boolean tile;
    private String habitat;
    private String type1;
    private String type2;

    public Monster(String name, int upperExtremity, int lowerExtremity, String body, boolean tile, String habitat, String type1, String type2) {
        this.name = name;
        this.upperExtremity = upperExtremity;
        this.lowerExtremity = lowerExtremity;
        this.body = body;
        this.tile = tile;
        this.habitat = habitat;
        this.type1 = type1;
        this.type2 = type2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUpperExtremity() {
        return upperExtremity;
    }

    public void setUpperExtremity(int upperExtremity) {
        this.upperExtremity = upperExtremity;
    }

    public int getLowerExtremity() {
        return lowerExtremity;
    }

    public void setLowerExtremity(int lowerExtremity) {
        this.lowerExtremity = lowerExtremity;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isTile() {
        return tile;
    }

    public void setTile(boolean tile) {
        this.tile = tile;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", upperExtremity=" + upperExtremity +
                ", lowerExtremity=" + lowerExtremity +
                ", body='" + body + '\'' +
                ", tile=" + tile +
                ", habitat='" + habitat + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                '}';
    }
}
