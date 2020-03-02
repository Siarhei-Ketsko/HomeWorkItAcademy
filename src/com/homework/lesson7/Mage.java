package com.homework.lesson7;

public class Mage extends Hero {

    public Mage(String name){
        super(name);
    }
    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamge(16000);
        System.out.println(getName() + " => Ледяная глыба");
    }
}
