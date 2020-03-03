package com.homework.lesson7;

public class Archer extends Hero {

    public Archer(String name) {
        super(name, 1600);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            enemy.takeDamge(250);
            System.out.println(getName() + " ⚔︎ Попал стрелой " + enemy.getName() + " и оставил ︎⚔ " + enemy.getHealth() + " ❤︎ здоровья " + enemy.getName());
        } else {
            enemy.takeDamge(0);
        }
    }

    @Override
    void ultimateAbility(Enemy enemy) {
        int ultimateFireArrow = (int) (Math.random() * 5);
        if (ultimateFireArrow == 1) {
            enemy.takeDamge(230);
            System.out.println(getName() + " Выпустил огненную стрелу!!! Оставило ︎⚔ " + enemy.getHealth() + " ❤︎ здоровья " + enemy.getName());
        }
    }
}
