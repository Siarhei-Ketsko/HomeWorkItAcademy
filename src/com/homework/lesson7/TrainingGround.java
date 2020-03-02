package com.homework.lesson7;

public class TrainingGround {
    public static void main(String[] args) {
       // Hero superman = new Hero("Superman");
       // superman.attackEnemy();
        Hero hero;
        Enemy enemy = new Enemy(1000);
        Enemy enemy1 = new Enemy(2000);
        Enemy enemy2 = new Enemy(3000);
        Hero axe = new Warrior("Axe");
        axe.attackEnemy(enemy);
        Hero crystalMaiden = new Mage("Crysta Maiden");
        crystalMaiden.attackEnemy(enemy1);
        Hero boneFletcher = new Archer("Bone Fletcher");
        boneFletcher.attackEnemy(enemy2);
      //  System.out.println(enemy.getHealth());
      //  System.out.println(enemy1.getHealth());
      //  System.out.println(enemy2.getHealth());

    }
}
