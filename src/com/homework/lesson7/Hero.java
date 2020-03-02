package com.homework.lesson7;

abstract class Hero {
    private String name;

    Hero() {
    }

    public Hero(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    abstract void attackEnemy(Enemy enemy);
}
