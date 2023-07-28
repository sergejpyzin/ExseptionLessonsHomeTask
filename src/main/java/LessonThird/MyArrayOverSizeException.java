package LessonThird;

public class MyArrayOverSizeException extends RuntimeException{
    public MyArrayOverSizeException(){
        super("Введенные данные больше необходимых!");
    }
}
