package LessonTwo;

import java.util.Scanner;

public class TaskFour {
    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    */

    public static void main(String[] args) {
        String massageFromUser = "Введите ваше сообщение: ";
        someString(massageFromUser);

    }

    private static void someString(String massageFromUser) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(massageFromUser);
        String userMassage = scanner.nextLine();

        if (userMassage.equals("")) {
            throw new RuntimeException("Сообщение не может быть пустым");
        }
        System.out.println("Ваше сообщение -> " + userMassage);
    }
}
