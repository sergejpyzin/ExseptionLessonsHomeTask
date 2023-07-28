package LessonThird;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] date = requestInformation();
        String gender = checkInputGender(date);
        System.out.println(gender);
        int phoneNumber = parseArrayElementInteger(date);

        Human me = new Human(date[0], date[1], date[2], date[3], phoneNumber, gender);
        System.out.println(me);
        FileWorker.write(me);



    }

    static String[] requestInformation() {
        Scanner scanner = new Scanner(System.in);
        String[] userAnswer = scanner.nextLine().replace(",", ".").split("\\s+");
        if (userAnswer.length < 6) {
            throw new MyArrayLessSizeException();
        }
        if (userAnswer.length > 6) {
            throw new MyArrayOverSizeException();
        }
        return userAnswer;
    }

    static int parseArrayElementInteger(String[] someArray) {
        int arrayElement = 0;
        try {
            arrayElement = Integer.parseInt(someArray[4]);
        } catch (NumberFormatException e) {
            System.err.println("Введено не число!");
        }
        return arrayElement;
    }

    static String checkInputGender(String[] someArray) throws Exception {
        String gender = "";
        if (someArray[5].equalsIgnoreCase("f")) {
            gender = "f";
        } else if (someArray[5].equalsIgnoreCase("m")) {
            gender = "m";
        } else {
            throw new Exception("Введено неверное значение пола");
        }
        return gender;
    }

}
