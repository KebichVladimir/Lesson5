package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BelVebATM belVebATM = new BelVebATM();
        belVebATM.getName();
        belVebATM.getFabricator();
        boolean exit = true;
        while (exit) {
            System.out.println("\nВыберите операцию:\n1-положить деньги \n2-снять деньги \n3-баланс \n4-доступные купюры \n5-выход");
            Scanner scan = new Scanner(System.in);
            int answer = scan.nextInt();
            switch (answer) {
                case 1:
                    belVebATM.putMoney();
                    break;
                case 2:
                    belVebATM.giveMoney();
                    break;
                case 3:
                    belVebATM.getBalance();
                    break;
                case 4:
                    belVebATM.getBills();
                    break;
                case 5:
                    exit = false;
                    break;
            }
        }
    }
}