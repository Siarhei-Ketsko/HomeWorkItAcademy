package com.homework.lesson7;

public class Enemy implements Mortal {

    private int health;

    public Enemy(int health){

        this.health = health;
    }

    public int getHealth() {
        if (health < 0) {
            return health = 0;
        }
        else return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int takeDamge(int damage) {
       return health -= damage;
    }
    public boolean isAlive(){
        return health > 0;
    }

}
