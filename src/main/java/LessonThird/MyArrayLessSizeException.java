package LessonThird;

public class MyArrayLessSizeException extends RuntimeException {
    public MyArrayLessSizeException() {
        super("Введенные данные меньше необходимых");
    }
}
