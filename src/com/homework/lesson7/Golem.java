package com.homework.lesson7;

public class Golem extends Enemy {

    public Golem(String name) {
        super(name,1560);
    }

    @Override
    void attackHero(Hero hero) {
        if (isAlive()) {
            hero.takeDamge(220);

            System.out.println(getName() + " ⚔︎ Нанес мощным ударом " + hero.getName() + " и оставил  ︎⚔ " + hero.getHealth() + " ❤︎ здоровья " + hero.getName());
        }
        else {
            hero.takeDamge(0);
        }
    }

    @Override
    void ultimateAbility(Hero hero) {
        int ultimateBlock = (int) (Math.random() * 6);
        if (isAlive() && ultimateBlock == 1) {
            System.out.println(getName() + " заблокировал 100 урона");
            setHealth(getHealth() + 100);
        }
    }

    @Override
    public void death() {
        super.death();
    }
}
