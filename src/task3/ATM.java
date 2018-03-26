package task3;

import java.util.Scanner;

public abstract class ATM implements RemoveFromATM, RefillATM, BalanceATM, BillsATM {
    private int sumBill20;
    private int sumBill50;
    private int sumBill100;
    private int balance;

    @Override
    public void putMoney() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Внесите деньги");
        System.out.println("Банкомат принимает купюры номиналом: \n20 рублей\n50 рублей\n100 рублей");
        int money = scan.nextInt();
        balance += money;
        sumBill100 += money / 100;
        int bill100 = money / 100;
        money -= bill100 * 100;
        sumBill50 += money / 50;
        int bill50 = money / 50;
        money -= bill50 * 50;
        sumBill20 += money / 20;
    }

    @Override
    public void giveMoney() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Какую сумму хотите снять со счета?");
        System.out.println("Банкомат принимает купюры номиналом: \n20 рублей\n50 рублей\n100 рублей");
        int money = scan.nextInt();
        if (money > balance) {
            System.out.println("У Вас недостаточно средств на счету");
        } else if (money / 100 <= sumBill100 && money % 100 == 0) {
            sumBill100 = sumBill100 - (money / 100);
            balance = balance - money;
        } else if (money / 50 <= sumBill50 && money % 50 == 0) {
            sumBill50 = sumBill50 - (money / 50);
            balance = balance - money;
        } else if (money / 20 <= sumBill20 && money % 20 == 0) {
            sumBill20 = sumBill20 - (money / 20);
            balance = balance - money;
        } else System.out.println("Нет купюр для выдачи денег. Выберете другую сумму");
    }

    @Override
    public void getBalance() {
        System.out.println("На вашем счету - " + balance);
    }

    @Override
    public void getBills() {
        System.out.println("Количество купюр номиналом 100 - " + getSumBill100());
        System.out.println("Количество купюр номиналом 50 - " + getSumBill50());
        System.out.println("Количество купюр номиналом 20 - " + getSumBill20());
    }

    int getSumBill100() {
        return sumBill100;
    }

    int getSumBill50() {
        return sumBill50;
    }

    int getSumBill20() {
        return sumBill20;
    }
}