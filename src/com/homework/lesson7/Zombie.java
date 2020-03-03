package com.homework.lesson7;

public class Zombie extends Enemy {
    public Zombie(String name) {
        super(name, 800);
    }

    @Override
    public void attackHero(Hero hero) {
        if (isAlive()) {
            hero.takeDamge(145);

            System.out.println(getName() + " ⚔︎ Ударил " + hero.getName() + " и оставил  ︎⚔ " + hero.getHealth() + " ❤︎ здоровья " + hero.getName());
        } else {
            hero.takeDamge(0);
        }
    }

    @Override
    public void ultimateAbility(Hero hero) {
        int ultimateResurrection = (int) (Math.random() * 6);
        if (!isAlive() && ultimateResurrection == 1) {
            System.out.println("Зомби воскресс!!! В своей локации");
            setHealth(800);
        }
    }
}
