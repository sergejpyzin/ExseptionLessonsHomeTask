package LessonOne;

import java.util.Arrays;

public class taskTwo {
    /*
    Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
    и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны - верните нулевой массив длины 1.
    Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:
    int[] a - первый массив
    int[] b - второй массив*/

    public static int[] subArrays(int[]a, int[]b){
        if (a.length != b.length){
            return new int[]{0};
        }
        int[]c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2, 3, 5};
        System.out.println(Arrays.toString(subArrays(a, b)));
    }
}
