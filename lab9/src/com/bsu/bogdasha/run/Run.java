package com.bsu.bogdasha.run;

import com.bsu.bogdasha.fileWorking.FileWorking;

import java.io.File;
import java.io.FileNotFoundException;

public class Run {

    public static final String FILE_PATH = "/Users/veronikabogdanovich/Documents/Java/lab9/src/com/bsu/bogdasha/veron.txt";
    public static final String FILE_PATH_POEM = "/Users/veronikabogdanovich/Documents/Java/lab9/src/verona";
    public static final String FILE_PATH2 = "/Users/veronikabogdanovich/Documents/Java/lab9/src/com/bsu/bogdasha/result/result.txt";

    public static void main(String[] args) {

        File file = new File(FILE_PATH);

        FileWorking fileWorking = new FileWorking(file);

        try {
            fileWorking.replaceInFile("public", "private");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            File result = new File(FILE_PATH2);
        }

        File file1 = new File(FILE_PATH_POEM);

        FileWorking fileWorking1 = new FileWorking(file1);


        try {
            fileWorking1.replaceInFile("торжественно", "очень празднично");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }
}
