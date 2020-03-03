package com.homework.lesson7;

abstract class Enemy implements Mortal {

    private String name;
    private int health;

    public Enemy(){

    }

    public Enemy(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        if (health < 0) {
            return health = 0;
        }
        else return health;
    }
    abstract void attackHero(Hero hero);

    public void setHealth(int health) {
        this.health = health;
    }
    public int takeDamge(int damage) {
       return health -= damage;
    }
    public boolean isAlive(){
        return health > 0;
    }
    abstract void ultimateAbility(Hero hero);

    public void death(){
       if (!isAlive()) System.out.println(getName() + " Мертв");
    }
}
