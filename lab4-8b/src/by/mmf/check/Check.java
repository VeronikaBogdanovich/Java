package by.mmf.check;

import by.mmf.exeptions.IllegalFreshException;
import by.mmf.exeptions.IllegalLengthxception;
import by.mmf.exeptions.IllegalPriceException;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    public static int checkFresh(String f) {
        int fr;
        try {
            if (f.equals("Свежая")) {
                fr = 0;
            } else if (f.equals("Средняя")) {
                fr = 1;
            } else if (f.equals("Несвежий")) {
                fr = 2;
            } else {
                throw new IllegalFreshException("Ошибка свежести цветка");
            }
        } catch (IllegalFreshException e) {
            fr = 2;
            e.printStackTrace();
        }
        return fr;
    }

    public static int checkLen(String lenOfStalk) {
        int l;
        Pattern regExp = Pattern.compile("\\d+");
        Matcher matcher = regExp.matcher(lenOfStalk);
        try {
            if (!matcher.matches()) {
                throw new IllegalLengthxception("Неправильный формат длинны стебля");
            }
            l = Integer.parseInt(lenOfStalk);
        } catch (IllegalLengthxception e) {
            l = 0;
            e.printStackTrace();
        }
        return l;
    }

    public static BigDecimal checkPrice(String price) {
        BigDecimal pr;
        Pattern regExp = Pattern.compile("\\d+[.,]\\d{2}");
        Matcher matcher = regExp.matcher(price);
        try {
            if (!matcher.matches()) {
                throw new IllegalPriceException("Неправильный формат стоймости");
            }
            pr = new BigDecimal(price);
        } catch (IllegalPriceException e) {
            pr = new BigDecimal("0000.00");
            e.printStackTrace();
        }
        return pr;
    }
}
