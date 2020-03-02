package com.homework.lesson7;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamge(100);
        System.out.println(getName() + " => Searing Arrows");
    }
}
