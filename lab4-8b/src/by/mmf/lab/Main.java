package by.mmf.lab;

import java.io.File;
import by.mmf.bouquet.Bouquet;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/veronikabogdanovich/Documents/Java/4-8b/src";
        File BouquetFile = new File(filePath, "b.txt");
        Bouquet b = new Bouquet(BouquetFile);
        Menu.GetMenu(b);
    }
}
