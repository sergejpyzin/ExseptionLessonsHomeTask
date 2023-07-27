package LessonThird;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String [] date = requestInformation();

        Human me = new Human(date[0], date[1], date[2], date[3], date[4], date[5]);
        System.out.println(me);

        String somePathName = "src\\main\\java\\LessonThird\\UserDateFile\\" + date[0] + ".txt";


        File file = new File(somePathName);
//create the file.
        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");

        }
        try {
            Files.write(Paths.get(somePathName), me.toString().getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
        static String[] requestInformation () {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine().split("\\s+");
        }
}
