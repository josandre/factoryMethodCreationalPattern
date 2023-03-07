package com.example.factorymethod.Product;

public abstract class Monster {

    private int id;
    private String name;
    private int upperExtremity;
    private int lowerExtremity;
    private String body;
    private boolean tail;
    private String habitat;
    private String type1;
    private String type2;

    private int life;

    private int force;

    private int defense;

    public Monster(int id, String name, int upperExtremity, int lowerExtremity, String body, boolean tail, String habitat, String type1, String type2, int life, int force, int defense) {
        this.id = id;
        this.name = name;
        this.upperExtremity = upperExtremity;
        this.lowerExtremity = lowerExtremity;
        this.body = body;
        this.tail = tail;
        this.habitat = habitat;
        this.type1 = type1;
        this.type2 = type2;
        this.life = life;
        this.force = force;
        this.defense = defense;
    }

    public Monster(){}

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

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", upperExtremity=" + upperExtremity +
                ", lowerExtremity=" + lowerExtremity +
                ", body='" + body + '\'' +
                ", tail=" + tail +
                ", habitat='" + habitat + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", life=" + life +
                ", force=" + force +
                ", defense=" + defense +
                '}';
    }
}
