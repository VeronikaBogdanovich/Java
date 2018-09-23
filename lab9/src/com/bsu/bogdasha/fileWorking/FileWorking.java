package com.bsu.bogdasha.fileWorking;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWorking {

    private File file;

    public FileWorking(File file) {
        this.file = file;
    }

    public void replaceInFile(String whatReplace, String replacement) throws FileNotFoundException {

        if (this.file.exists()) {
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(this.file), StandardCharsets.UTF_8))){
                String line;
                while ((line = reader.readLine()) != null) {

                    while (line.contains(whatReplace)) {
    
                        line = line.replace(whatReplace, replacement);
                    }

                    System.out.println(line);
                }


            } catch (IOException e) {
                // log error
            }

        }
    };
}
