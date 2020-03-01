package com.homework.lesson4;

import java.util.Scanner;

public class MiniBankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniBank test = new MiniBank(10, 20 ,30);
        int menu;
         while (true) {
             System.out.println("Введите \"1\" Если хотите снять деньги");
             System.out.println("Введите \"2\" Если хотите добавить деньги в банкомат");
             System.out.println("Введите \"3\" Если хотите посмотреть количество \"Номиналов банкнот\" в банкомате");
             System.out.println("Введите \"0\" Если хотите выйти из программы");
             menu = sc.nextInt();
             if (menu == 0) {
                 break;
             }
             if (menu == 1) {
                 System.out.println("Введите сумму");
                 if (test.widthdraw(sc.nextInt())) {
                     test.printBanknote();
                 }
                 else {
                     test.printResult();
                 }
             }
             else if (menu == 2) {
                 System.out.println("Введите количество купюр через пробел Номиналы \"20\" \"50\" \"100\"");
                 test.addMoney(sc.nextInt(), sc.nextInt(),sc.nextInt());
             }
             else if (menu == 3) {
                 test.printCountBanknotes();
             }
         }
    }
}
                         