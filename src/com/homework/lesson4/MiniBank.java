package com.homework.lesson4;

public class MiniBank {
    private int countBanknoteTwenty;
    private int countBanknoteFifty;
    private int countBanknoteOneHundred;
    private int money;


    public MiniBank(int countBanknoteTwenty, int countBanknoteFifty, int countBanknoteOneHundred) {
        this.countBanknoteTwenty = countBanknoteTwenty;
        this.countBanknoteFifty = countBanknoteFifty;
        this.countBanknoteOneHundred = countBanknoteOneHundred;
    }

    public void addMoney(int countBanknoteTwenty, int countBanknoteFifty, int countBanknoteOneHundred) {
        this.countBanknoteTwenty += countBanknoteTwenty;
        this.countBanknoteFifty += countBanknoteFifty;
        this.countBanknoteOneHundred += countBanknoteOneHundred;

    }

    public boolean widthdraw(int moneyRequests) {
        money = moneyRequests;
        if (moneyRequests % 10 == 0 && moneyRequests >= 20 && moneyRequests != 30) {
            return (moneyRequests <= countBanknoteTwenty * 20 + countBanknoteFifty * 50 + countBanknoteOneHundred * 100);
        }
        else return false;
    }
    public void printBanknote(){
        int c20 = 0;
        int c50 = 0;
        int c100 = 0;
            while (money != 0) {
                if (money % 20 != 0 && money % 50 != 0 && money % 100 != 0 && money > 20 && countBanknoteTwenty > 0) {
                    money -= 20;
                    c20++;
                    countBanknoteTwenty--;
                } else if (money - 100 >= 0 && countBanknoteOneHundred > 0) {
                    money -= 100;
                    c100++;
                    countBanknoteOneHundred--;
                } else if (money - 50 >= 0 && (money % 100) / 10 != 6 && (money % 100) / 10 != 8 && countBanknoteFifty > 0) {
                    money -= 50;
                    c50++;
                    countBanknoteFifty--;
                } else if (money - 20 >= 0 && countBanknoteTwenty > 0) {
                    money -= 20;
                    c20++;
                    countBanknoteTwenty--;
                }
                else {
                    countBanknoteTwenty += c20;
                    countBanknoteFifty += c50;
                    countBanknoteOneHundred += c100;
                    c20 = 0;
                    c50 = 0;
                    c100 = 0;
                    money = 0;
                    System.out.println("В банкомате недостаточно купюр для запрашиваемой суммы");
                }
            }
            System.out.println("Выдано купюрами по 20 BYN " + c20 + " шт");
            System.out.println("Выдано купюрами по 50 BYN " + c50 + " шт");
            System.out.println("Выдано купюрами по 100 BYN " + c100 + " шт");
    }


    public void printResult() {

        if (money % 10 > 0 || money < 20 || money == 30) {
            System.out.println("Введена некорректная сумма");
        }
        else {
            System.out.println("В банкомате недостаточно денег");
        }

    }
    public void printCountBanknotes(){
        System.out.println("Количество банкнот номиналом 20 = " + countBanknoteTwenty);
        System.out.println("Количество банкнот номиналом 50 = " + countBanknoteFifty);
        System.out.println("Количество банкнот номиналом 100 = " + countBanknoteOneHundred);
        System.out.println("Максимальная сумма = " + (countBanknoteTwenty * 20 + countBanknoteFifty * 50 + countBanknoteOneHundred * 100));
    }

}

