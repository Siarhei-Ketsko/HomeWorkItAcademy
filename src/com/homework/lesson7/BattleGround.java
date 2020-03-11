package com.homework.lesson7;

import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        Enemy zombie = new Zombie("Undying");
        Enemy goul = new Goul("Naix");
        Enemy golem = new Golem("Stone Gigant");
        Scanner sc = new Scanner(System.in);
        printDescriptionHero();
        int mainMenu = sc.nextInt();
        int menu;
        boolean exit = false;
        if (mainMenu == 1) {
            System.out.println("Вы выбрали Война! Введите имя героя");
            Hero warrior = new Warrior(sc.next());
            printDescriptionEnemy();
            while (warrior.isAlive() && !exit) {
                printActions();
                menu = sc.nextInt();
                switch (menu) {
                    case 1: fight(zombie, warrior); break;
                    case 2: fight(goul, warrior); zombie.ultimateAbility(warrior); break;
                    case 3: fight(golem, warrior); zombie.ultimateAbility(warrior); break;
                    case 4: warrior.setHealth(2000); System.out.println("Здоровье восстановлено ❤ " + warrior.getHealth()); break;
                    case 0: exit = true; break;
                }
                warrior.death();
            }
        } else if (mainMenu == 2) {
            System.out.println("Вы выбрали Мага! Введите имя героя");
            Hero mage = new Mage(sc.next());
            printDescriptionEnemy();
            while (mage.isAlive() && !exit) {
                printActions();
                menu = sc.nextInt();
                switch (menu) {
                    case 1: fight(zombie, mage); break;
                    case 2: fight(goul, mage); zombie.ultimateAbility(mage); break;
                    case 3: fight(golem, mage); zombie.ultimateAbility(mage); break;
                    case 4: mage.setHealth(1800); System.out.println("Здоровье восстановлено ❤ " + mage.getHealth()); break;
                    case 0: exit = true; break;
                }
                mage.death();
            }
        } else if (mainMenu == 3) {
            System.out.println("Вы выбрали Лучника! Введите имя героя");
            Hero archer = new Archer(sc.next());
            printDescriptionEnemy();
            while (archer.isAlive() && !exit) {
                printActions();
                menu = sc.nextInt();
                switch (menu) {
                    case 1: fight(zombie, archer); break;
                    case 2: fight(goul, archer); zombie.ultimateAbility(archer); break;
                    case 3: fight(golem, archer); zombie.ultimateAbility(archer); break;
                    case 4: archer.setHealth(1600); System.out.println("Здоровье восстановлено ❤ " + archer.getHealth()); break;
                    case 0: exit = true; break;
                }
                archer.death();
            }
        }
    }

    public static void fight(Enemy enemy, Hero hero) {

        while (enemy.isAlive() && hero.isAlive()) {
            hero.attackEnemy(enemy);
            hero.ultimateAbility(enemy);
            enemy.attackHero(hero);
            enemy.ultimateAbility(hero);
            enemy.death();
        }

        System.out.println("У вас осталось " + hero.getHealth() + " ❤︎ Здоровья");

    }

    public static void printDescriptionHero() {
        System.out.println("Выберите героя введя число");
        System.out.println("1. Воин \"Здоровье 2000\" \"Урон 149\" \"Способность нанести двойной урон\"");
        System.out.println("2. Маг льда \"Здоровье 1800\" \"Урон 110\" \"Способность ледяная глыба наносит 286 урона\"");
        System.out.println("3. Лучник \"Здоровье 1600\" \"Урон 250\" \"Способность огненная стрела наносит 230 урона\"");
    }

    public static void printActions() {
        System.out.println("1. Вступить в бой с Зомби 2. Вступить в бой с Гулей 3. Вступить в бой с големом 4. Восстановить здоровье 0. Закончить игру");
    }

    public static void printDescriptionEnemy() {
        System.out.println("!!!!Следите за здоровьем!!!!!!Если герой умрет игра закончится");
        System.out.println("Введите цифру чтобы вступить в бой с:");
        System.out.println("1. Зомби(Может воскреснуть)");
        System.out.println("2. Гуля (Может при атаке восстановить часть здоровья)");
        System.out.println("3. Каменный голем (Может заблокировать 100 урона)");
        System.out.println("4. Можете вернуться домой восстановить здоровье");
    }
}

