package com.homework.lesson7;

public class Mage extends Hero {

    public Mage(String name){
        super(name, 1800);
    }
    @Override
    public void attackEnemy(Enemy enemy){
        if (isAlive()) {
            enemy.takeDamge(110);
            System.out.println(getName() + " ⚔︎ Ударил магией " + enemy.getName() +  " и оставил ︎⚔ " + enemy.getHealth() + " ❤︎ здоровья " + enemy.getName());
        }
        else {
            enemy.takeDamge(0);
        }
    }

    @Override
    void ultimateAbility(Enemy enemy) {
        int ultimateFrostBolt = (int)(Math.random()*5);
        if (ultimateFrostBolt == 1) {
            enemy.takeDamge(286);
            System.out.println(getName() + " Сработало заклинание Ледяная глыба!!! Оставило ︎⚔ "  + enemy.getHealth() + " ❤︎ здоровья " + enemy.getName());
        }
    }
}
