package LessonTwo;

import java.util.Arrays;
import java.util.Random;

public class TaskTwo {
    // Если необходимо, исправьте данный код
    public static void main(String[] args) throws Exception {

        int[] intArray = createdArray(10, 5, 7);
        System.out.println(Arrays.toString(intArray));

        int d = 4;
        double catchedRes1 = (double) intArray[8] / d;
        /*
        В обработке деления на ноль нет необходимости т.к. при делении на ноль чисел с плавающей запятой результат
        будет равен NaN или INFINITY, для дальнейшей обработки, если это будет необходимо, результатов NaN или INFINITY
        "бросаем" новые исключения
        */
        if (Double.isNaN(catchedRes1)) {
            throw new Exception("NaN");
        } else if (Double.isInfinite(catchedRes1)) {
            throw new Exception("INFINITY");
        }
        System.out.println("catchedRes1 = " + catchedRes1);

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
