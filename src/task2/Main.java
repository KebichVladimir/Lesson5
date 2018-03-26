package task2;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        BirthdayInformation birthdayInformation = new BirthdayInformation();
        birthdayInformation.getInputInformation(students);
        for (int i = 0; i < students.length; i++)
            students[i].getInfo();
        birthdayInformation.getAverageAge(students);
    }
}