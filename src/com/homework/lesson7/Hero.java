package com.homework.lesson7;

abstract class Hero implements Mortal {
    private String name;
    private int health;

    Hero() {
    }

    public Hero(String name, int health) {
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

   public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamge(int damage) {
        return health -= damage;
    }
    public boolean isAlive(){
        return health > 0;
    }
    public void death(){
        if (!isAlive()) System.out.println(getName() + " Мертв");
    }

    abstract void attackEnemy(Enemy enemy);

    abstract void ultimateAbility(Enemy enemy);
}
