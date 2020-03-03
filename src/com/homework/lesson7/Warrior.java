package com.homework.lesson7;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name, 2000);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            enemy.takeDamge(149);
            System.out.println(getName() + " ⚔︎ Ударил топором " + enemy.getName() + " и оставил ︎⚔ " + enemy.getHealth() + " ❤︎ здоровья " + enemy.getName());
        } else {
            enemy.takeDamge(0);
        }
    }

    @Override
    public void ultimateAbility(Enemy enemy) {
        int ultimateCritical = (int) (Math.random() * 4);
        if (ultimateCritical == 1) {
            enemy.takeDamge(149);
            System.out.println(getName() + " Нанес критический урон!!! Оставил ︎⚔ " + enemy.getHealth() + " ❤︎ здоровья " + enemy.getName());
        }
    }

}
