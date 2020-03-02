package com.homework.lesson7;

public class Warrior extends Hero {

    public Warrior(String name) {

        super(name);
    }

    @Override
public void attackEnemy(Enemy enemy){

        enemy.takeDamge(149);

        System.out.println(getName() + " ⚔︎ Удар топором оставил ︎⚔ " + enemy.getHealth() + " ❤︎ здоровья");
    }


}
