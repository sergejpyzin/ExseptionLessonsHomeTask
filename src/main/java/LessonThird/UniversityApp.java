package LessonThird;

import java.util.Scanner;

public class UniversityApp {

    static void anotherWork() {
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
        String gender = "";
        if (checkInputGender(userDate)) {
            gender = userDate[5];
        } else {
            try {
                throw new RuntimeException("Введено неверное определение пола");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        Human human = new Human(userDate[0], userDate[1], userDate[2], userDate[3], phoneNumber, gender);
        FileWorker.write(human);
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
            String gender = "";
            if (checkInputGender(userDate)) {
                gender = userDate[5];
            } else {
                try {
                    throw new RuntimeException("Введено неверное определение пола");
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }
            }
            Human human = new Human(userDate[0], userDate[1], userDate[2], userDate[3], phoneNumber, gender);
            FileWorker.write(human);
            System.out.println("Вы хотите продолжить? q - выход из программы, y - продолжить");
            exit = sc.nextLine();
        } while (!exit.equalsIgnoreCase("q"));
        System.exit(0);

    }

    private static String[] requestInformation() {
        Scanner scanner = new Scanner(System.in);
        String[] userAnswer = scanner.nextLine().replace(",", ".").split("\\s+");
        if (userAnswer.length < 6) {
            try {
                throw new ArrayIndexOutOfBoundsException("Введенная информация меньше необходимой!");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        if (userAnswer.length > 6) {
            try {
                throw new ArrayIndexOutOfBoundsException("Введенная информация больше необходимой!");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        return userAnswer;
    }

    private static int parseArrayElement(String[] someArray) {
        int arrayElement = 0;
        try {
            arrayElement = Integer.parseInt(someArray[4]);
        } catch (NumberFormatException e) {
            System.out.println("Введено не число!");
            e.printStackTrace();
        }
        return arrayElement;
    }

    private static boolean checkInputGender(String[] someArray) {
        String gender = "";
        if (someArray[5].equals("f") || someArray[5].equals("m")) {
            return true;
        }
        return false;
    }

}
