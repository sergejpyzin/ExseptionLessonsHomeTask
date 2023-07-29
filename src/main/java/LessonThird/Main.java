package LessonThird;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        String[] date = requestInformation();
        String gender = checkInputGender(date);
        System.out.println(gender);
        int phoneNumber = parseArrayElementInteger(date);

        Human me = new Human(date[0], date[1], date[2], date[3], phoneNumber, gender);
        System.out.println(me);
        FileWorker.write(me);
        */
        work();


    }

    static void work() {
        Scanner sc = new Scanner(System.in);
        String exit;
        do {
            System.out.println("""
                    Введите информацию о пользователе в следующем формате:
                    Фамилия Имя Отчество дата_рождения номер_телефона пол  - через пробел, без знаков препинания;
                    номер_телефона - целое беззнаковое число;
                    пол:
                    m - мужской
                    f - женский
                    """);
            String[] userDate = requestInformation();
            int phoneNumber = parseArrayElement(userDate);
            String gender;
            if (checkInputGender(userDate)) {
                gender = userDate[5];
            } else {
                throw new RuntimeException("Введено неверное определение пола");
            }
            Human human = new Human(userDate[0], userDate[1], userDate[2], userDate[3], phoneNumber, gender);
            FileWorker.write(human);
            System.out.println("Вы хотите продолжить? q - выход из программы, y - продолжить");
            exit = sc.nextLine();
        } while (!exit.equalsIgnoreCase("q"));
        System.exit(0);

    }

    static String[] requestInformation() {
        Scanner scanner = new Scanner(System.in);
        String[] userAnswer = scanner.nextLine().replace(",", ".").split("\\s+");
        if (userAnswer.length < 6) {
            try {
                throw new MyArrayLessSizeException();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        if (userAnswer.length > 6) {
            try {
                throw new MyArrayOverSizeException();
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        return userAnswer;
    }

    static int parseArrayElement(String[] someArray) {
        int arrayElement = 0;
        try {
            arrayElement = Integer.parseInt(someArray[4]);
        } catch (NumberFormatException e) {
            System.err.println("Введено не число!");
        }
        return arrayElement;
    }

    static boolean checkInputGender(String[] someArray) {
        String gender = "";
        if (someArray[5].equals("f") || someArray[5].equals("m")) {
            return true;
        }
        return false;
    }

}
