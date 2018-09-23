package var2;

import base.Punctuation;
import base.Text;
import base.Sentence;
import base.Word;

import java.io.IOException;
import java.util.*;

public class WordsInSentencesMain {

    public static void partB() {
        String text = "Весна - прекрасное время года.\n" +
                "Весной разбухают почки, становится теплее после холодных зим, расцветают всеми любимые цветы подснежники.\n" +
                "Журчат ручьи, по крышам домов капает капель.\n" +
                "Солнце светит всё ярче. Тает снег, травка зеленеет, птички прилетают с югов.\n" +
                "Весна бывает теплая, бывает холодная. Я надеюсь, что нынешняя весна будет тёплой и селнечной.\n" +
                "А после весны настаёт лето. ";

        System.out.println("Текст:\n" + text);

        Sentence[] sentences = Sentence.toSentencesArray(text);

        Arrays.sort(sentences, Collections.reverseOrder());
        System.out.println("\nОтсортированное:");
        for (Sentence s : sentences) {
            System.out.println(s);
        }
    }

    public static void partC() {
        String text = "Весна- прекрасное время года. Это точно!\n";

        int maxDistance = -1;
        char maxSymbol = '!';

        for (char symbol = 'а'; symbol <= 'я'; symbol++) {
            int firstIndex = text.toLowerCase().indexOf(symbol);
            int lastIndex = text.toLowerCase().lastIndexOf(symbol);

            int distance = lastIndex - firstIndex;
            if (distance > 0) {
                System.out.println(String.valueOf(symbol) + " " + distance);
            }

            if (distance > maxDistance) {
                maxDistance = distance;
                maxSymbol = symbol;
            }
        }

        System.out.println("\nMax: " + String.valueOf(maxSymbol) + " - " + maxDistance);

        int maxIndex = text.toLowerCase().indexOf(maxSymbol);
        text = text.replace(text.substring(maxIndex, maxIndex + maxDistance + 1), "");

        System.out.println(text);

    }

    public static void main(String[] args) {

 //       partB();

        partC();
    }
}