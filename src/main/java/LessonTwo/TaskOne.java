package LessonTwo;


import java.util.Scanner;

public class TaskOne {
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
    запросить у пользователя ввод данных.
    */

    public static void main(String[] args) {
        String massage = "Введите число: ";
        float numberFloat = requestFromUserVariantOne(massage);
        System.out.println(numberFloat);
        float floatNumber = requestFromUserVariantTwo(massage);
        System.out.println(floatNumber);

    }

    /**
     * Эта функция проверяет на соответствие типу float ввод пользователя вариант 1 с использованием рекурсивного запроса
     * @param massage  - сообщение для пользователя
     * */
    public static float requestFromUserVariantOne(String massage) {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        System.out.print(massage);
        if (scanner.hasNextFloat()) {
            result = scanner.nextFloat();
        } else {
            System.err.println("Введено не число");
            requestFromUserVariantOne(massage);
        }
        return result;
    }

    /**
     * Эта функция проверяет на соответствие типу float ввод пользователя вариант 2 с использованием цикла while()
     * и обработкой ошибки
     * @param massage  - сообщение для пользователя
     *
     */
    public static float requestFromUserVariantTwo(String massage) {
        Scanner scanner = new Scanner(System.in);
        float result;
        while (true) {
            System.out.println(massage);
            try {
                result = Float.parseFloat(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Неверный ввод.");
            }
        }
        return result;
    }

}
