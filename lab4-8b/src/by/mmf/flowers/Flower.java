package by.mmf.flowers;

import by.mmf.check.*;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Flower {
    private int fresh;
    private BigDecimal price;
    private int lenOfStalk;

    public Flower(String fresh, BigDecimal price, int lenOfStalk) {
        this.fresh = Check.checkFresh(fresh);
        this.price = price;
        this.lenOfStalk = lenOfStalk;
    }

    public Flower(String args) {
        String[] result = args.split(" ");
        setFresh(result[1]);
        setPrice(result[2]);
        setLenOfStalk(result[3]);
    }

    public String getFresh() {
        if (fresh == 0) {
            return "Свежие";
        } else if (fresh == 1) {
            return "Средней свежести";
        }
        return "Несвежие";
    }

    public int getIntFresh() {
        return fresh;
    }

    public void setFresh(int fresh) {
        this.fresh = fresh;
    }

    public void setFresh(String fresh) {
        this.fresh =  Check.checkFresh(fresh);
    }

    public BigDecimal getPrice() {
        return price;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPrice(String price) {
        this.price =  Check.checkPrice(price);
    }

    public int getLenOfStalk() {
        return lenOfStalk;
    }

    public void setLenOfStalk(int lenOfStalk) {
        this.lenOfStalk = lenOfStalk;
    }

    public void setLenOfStalk(String lenOfStalk) {
        this.lenOfStalk =  Check.checkLen(lenOfStalk);
    }
}
