package LessonOne;

import java.util.Random;

public class TaskOne {
   /*
   Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
    Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
    Метод divisionByZero - Деление на 0
    Метод numberFormatException - Ошибка преобразования строки в число
    Важно: они не должны принимать никаких аргументов
    */

    public static void arrayOutOfBoundsException() {
        int[] someArray = {1, 2, 3, 4, 5};
        someArray[6] = 7;
    }

    public static void divizionByZero() {
        int numberOne = 10;
        int numberTwo = 0;
        System.out.println(numberOne / numberTwo);
    }

    public static void numberFormatException(){
        int number = Integer.parseInt("one");

    }
    public static void main(String[] args) {
        numberFormatException();
        //divizionByZero();
        //arrayOutOfBoundsException();
    }
}
