package com.homework.lesson7;

public class Goul extends Enemy {

    public Goul(String name) {
        super(name, 1350);
    }

    @Override
    void attackHero(Hero hero) {
        if (isAlive()) {
            hero.takeDamge(135);

            System.out.println(getName() + " ⚔︎ Укусил " + hero.getName() + " и оставил  ︎⚔ " + hero.getHealth() + " ❤︎ здоровья " + hero.getName());
        } else {
            hero.takeDamge(0);
        }
    }

    @Override
    void ultimateAbility(Hero hero) {
        int ultimate = (int) (Math.random() * 3);
        if (isAlive() && ultimate == 1) {
            System.out.println(getName() + " Вампиризмом восстановил 67 ❤︎ здоровья");
            setHealth(getHealth() + 67);
        }
    }

    @Override
    public void death() {
        super.death();
    }
}

