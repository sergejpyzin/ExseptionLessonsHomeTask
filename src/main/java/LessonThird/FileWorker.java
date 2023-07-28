package LessonThird;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWorker {
    public static void write(Human human) {
        String pathName = "src\\main\\java\\LessonThird\\UserDateFile\\" + human.getLastName() + ".txt";
        if (!Files.exists(Path.of(pathName))) {
            try {
                Files.createFile(Path.of(pathName));
                Files.writeString(Paths.get(pathName), human.toString(), StandardOpenOption.WRITE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Files.writeString(Paths.get(pathName), human.toString(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}


