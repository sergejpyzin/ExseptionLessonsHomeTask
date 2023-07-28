package LessonThird;

public class MyArraySizeLessException extends RuntimeException {
    public MyArraySizeLessException() {
        super("Введенные данные меньше необходимых");
    }
}
