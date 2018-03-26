package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String secondName;
    private Date birthday;

    public void getFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date setBirthday(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            birthday = format.parse(date);
        } catch (ParseException e) {
            System.out.println("Неверная дата рождения");
        }
        return birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void getInfo() {
        System.out.println("\nИмя студента - " + firstName);
        System.out.println("Фамилия студента - " + secondName);
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Дата рождения:", birthday);
    }
}