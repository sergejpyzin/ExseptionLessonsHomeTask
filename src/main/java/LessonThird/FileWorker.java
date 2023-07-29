package LessonThird;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileWorker {
    public static void write(Human human) {
        String pathName = "src\\main\\java\\LessonThird\\UserDateFile\\" + human.getLastName() + ".txt";
        Path path = Path.of(pathName);
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
                Files.writeString(path, human.toString(), StandardOpenOption.WRITE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Files.writeString(path, human.toString(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}


