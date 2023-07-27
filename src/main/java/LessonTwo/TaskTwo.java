package LessonTwo;

import java.util.Arrays;
import java.util.Random;

public class TaskTwo {
    // Если необходимо, исправьте данный код
    public static void main(String[] args) throws Exception {
        // Создаем массив для проверки
        int[] intArray = createdArray(10, 5, 7);
        System.out.println(Arrays.toString(intArray));

        int d = 0;

        try {
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Выход за пределы массива" + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Деление на ноль запрещено" + e.getMessage());
        }
    }

    /**
     * Метод создания массива с псевдослучайными элементами
     *
     * @param lengthArray - длинна массива
     * @param minValue    - минимальное значение диапазона псевдослучайных чисел
     * @param maxValue    - максимальное значение диапазона псевдослучайных чисел
     */
    public static int[] createdArray(int lengthArray, int minValue, int maxValue) {
        Random random = new Random();
        int[] someArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            someArray[i] = random.nextInt(minValue, maxValue + 1);
        }
        return someArray;
    }

}
