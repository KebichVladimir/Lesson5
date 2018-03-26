package task2;

import java.util.Date;
import java.util.Scanner;

public class BirthdayInformation implements AverageAge, InputInformation {

    @Override
    public void getInputInformation(Student[] students) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Ввидите имя:");
            students[i].getFirstName(scan.nextLine());
            System.out.println("Ввидите фамилию:");
            students[i].getSecondName(scan.nextLine());
            System.out.println("Введите дату рождения(yyyy-MM-dd):");
            students[i].setBirthday(scan.nextLine());
        }
    }

    @Override
    public void getAverageAge(Student[] students) {
        Date now = new Date();
        long time = 0;
        for (int i = 0; i < students.length; i++) {
            time = time + ((students[i].getBirthday().getTime())) / students.length;
        }
        long difference = now.getTime() - time;
        int years = (int) (difference / 365 / 24 / 60 / 60 / 1000);
        long differenceYears = difference / 1000 - years * 365 * 24 * 60 * 60;
        int months = (int) (differenceYears * 12 / 365 / 24 / 60 / 60);
        long differenceMonths = differenceYears - months * 365 / 12 * 24 * 60 * 60;
        int days = (int) (differenceMonths / (24 * 60 * 60));
        long differenceDays = differenceMonths - days * 24 * 60 * 60;
        int hours = (int) (differenceDays / (60 * 60));
        long differenceHours = differenceDays - hours * 60 * 60;
        int minutes = (int) (differenceHours / 60);
        System.out.println("\nСредний возраст:" + "\nЛет-" + years + " Месяцев-" + months + " Дней-" + days + " Часов-" + hours + " Минут-" + minutes);
    }
}