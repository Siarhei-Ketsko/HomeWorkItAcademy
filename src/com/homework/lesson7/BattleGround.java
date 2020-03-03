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
        if (mainMenu == 1) {
            System.out.println("Вы выбрали Война! Введите имя героя");
            Hero warrior = new Warrior(sc.next());
            int menu;
            printDescriptionEnemy();
            while (true) {
                printActions();
                menu = sc.nextInt();
                if (menu == 0) {
                    break;
                }
                else if (menu == 1 && warrior.isAlive()) {
                    fight(zombie, warrior);
                }
                else if (menu == 2 && warrior.isAlive()) {
                    fight(goul, warrior);
                }
                else if (menu == 3 && warrior.isAlive()) {
                    fight(golem, warrior);
                }
                else if (menu == 4 && warrior.isAlive()) {
                    warrior.setHealth(2000);
                    System.out.println("Здоровье восстановлено ❤ " + warrior.getHealth());
                }
                else {
                    warrior.death();
                    break;
                }

            }
        }
        else if (mainMenu == 2) {
            System.out.println("Вы выбрали Мага! Введите имя героя");
            Hero mage = new Mage(sc.next());
            int menu;
            printDescriptionEnemy();
            while (true) {
                printActions();
                menu = sc.nextInt();
                if (menu == 0 && !mage.isAlive()) {
                    break;
                }
                else if (menu == 1 && mage.isAlive()) {
                    fight(zombie,mage);

                }
                else if (menu == 2 && mage.isAlive()) {
                    fight(goul,mage);
                }
                else if (menu == 3) {
                    fight(golem,mage);
                }
                else if (menu == 4 && mage.isAlive()) {
                    mage.setHealth(1800);
                    System.out.println("Здоровье восстановлено ❤ " + mage.getHealth());
                }
                else {
                    mage.death();
                    break;
                }
            }
        }
        else if (mainMenu == 3) {
            System.out.println("Вы выбрали Лучника! Введите имя героя");
            Hero archer = new Archer(sc.next());
            int menu;
            printDescriptionEnemy();
            while (true) {
                printActions();
                menu = sc.nextInt();
                if (menu == 0 && !archer.isAlive()) {
                    break;
                }
                else if (menu == 1 && archer.isAlive()) {
                   fight(zombie,archer);
                }
                else if (menu == 2 && archer.isAlive()) {
                   fight(goul,archer);
                }
                else if (menu == 3 && archer.isAlive()) {
                    fight(golem,archer);
                }
                else if (menu == 4 && archer.isAlive()) {
                    archer.setHealth(2000);
                    System.out.println("Здоровье восстановлено ❤ " + archer.getHealth());
                }
                else {
                    archer.death();
                    break;
                }

            }
        }
    }

    public static void fight(Enemy enemy, Hero hero) {

            while (enemy.isAlive()) {
                hero.attackEnemy(enemy);
                hero.ultimateAbility(enemy);
                enemy.attackHero(hero);
                hero.ultimateAbility(enemy);
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
        System.out.println("Введите цифру чтобы вступить в бой с:");
        System.out.println("1. Зомби(Может воскреснуть)");
        System.out.println("2. Гуля (Может при атаке восстановить часть здоровья)");
        System.out.println("3. Каменный голем (Может заблокировать 100 урона)");
        System.out.println("4. Можете вернуться домой восстановить здоровье");
    }
}

