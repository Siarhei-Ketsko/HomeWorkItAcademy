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
                    while (zombie.isAlive()) {
                    warrior.attackEnemy(zombie);
                    warrior.ultimateAbility(zombie);
                    zombie.attackHero(warrior);
                    zombie.ultimateAbility(warrior);
                    zombie.death();
                        System.out.println("У вас осталось " + warrior.getHealth() + " ❤︎ Здоровья");
                    }

                }
                else if (menu == 2 && warrior.isAlive()) {
                    while (goul.isAlive()) {
                    warrior.attackEnemy(goul);
                    warrior.ultimateAbility(goul);
                    goul.attackHero(warrior);
                    goul.ultimateAbility(warrior);
                    goul.death();
                    zombie.ultimateAbility(warrior);
                        System.out.println("У вас осталось " + warrior.getHealth() + " ❤︎ Здоровья");
                    }
                }
                else if (menu == 3 && warrior.isAlive()) {
                    while (golem.isAlive()) {
                    warrior.attackEnemy(golem);
                    warrior.ultimateAbility(golem);
                    golem.attackHero(warrior);
                    golem.ultimateAbility(warrior);
                    golem.death();
                    zombie.ultimateAbility(warrior);
                        System.out.println("У вас осталось " + warrior.getHealth() + " ❤︎ Здоровья");
                    }
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
                    while (zombie.isAlive()) {
                        mage.attackEnemy(zombie);
                        mage.ultimateAbility(zombie);
                        zombie.attackHero(mage);
                        zombie.ultimateAbility(mage);
                        zombie.death();
                        System.out.println("У вас осталось " + mage.getHealth() + " ❤︎ Здоровья");
                    }

                }
                else if (menu == 2 && mage.isAlive()) {
                    while (goul.isAlive()) {
                    mage.attackEnemy(goul);
                    mage.ultimateAbility(goul);
                    goul.attackHero(mage);
                    goul.ultimateAbility(mage);
                    goul.death();
                    zombie.ultimateAbility(mage);
                        System.out.println("У вас осталось " + mage.getHealth() + " ❤︎ Здоровья");
                    }
                }
                else if (menu == 3) {
                    while (golem.isAlive()) {
                    mage.attackEnemy(golem);
                    mage.ultimateAbility(golem);
                    golem.attackHero(mage);
                    golem.ultimateAbility(mage);
                    golem.death();
                    zombie.ultimateAbility(mage);
                        System.out.println("У вас осталось " + mage.getHealth() + " ❤︎ Здоровья");
                    }
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
                    while (zombie.isAlive()) {
                    archer.attackEnemy(zombie);
                    archer.ultimateAbility(zombie);
                    zombie.attackHero(archer);
                    zombie.ultimateAbility(archer);
                    zombie.death();
                        System.out.println("У вас осталось " + archer.getHealth() + " ❤︎ Здоровья");
                    }

                }
                else if (menu == 2 && archer.isAlive()) {
                    while (goul.isAlive()) {
                    archer.attackEnemy(goul);
                    archer.ultimateAbility(goul);
                    goul.attackHero(archer);
                    goul.ultimateAbility(archer);
                    goul.death();
                    zombie.ultimateAbility(archer);
                        System.out.println("У вас осталось " + archer.getHealth() + " ❤︎ Здоровья");
                    }
                }
                else if (menu == 3 && archer.isAlive()) {
                    while (golem.isAlive()) {
                    archer.attackEnemy(golem);
                    archer.ultimateAbility(golem);
                    golem.attackHero(archer);
                    golem.ultimateAbility(archer);
                    golem.death();
                    zombie.ultimateAbility(archer);
                        System.out.println("У вас осталось " + archer.getHealth() + " ❤︎ Здоровья");
                    }
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

