package LessonOne;

import java.lang.reflect.Array;
import java.util.Arrays;

public class taskThree {
    /*
    Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
    и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны - верните нулевой массив длины 1.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
    */
    public static int[] divArrays (int[]a, int[]b){
        if (a.length != b.length){
            return new int[]{0};
        }
        int[]c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0){
                throw new RuntimeException("Деление на НОЛЬ невозможно!");
            }
            c[i] = a[i] / b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = new int[]{12, 8, 16};
        int[] b = new int[]{4, 2, 0};
        String divResult = Arrays.toString(divArrays(a, b));
        System.out.println(divResult);
    }
}
