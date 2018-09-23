package by.mmf.accessories;

import by.mmf.check.Check;
import by.mmf.exeptions.IllegalPriceException;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Accessories {
    private BigDecimal price = new BigDecimal(0);

    public Accessories() {

    }

    public Accessories(BigDecimal price) {
        this.price = price;
    }

    public Accessories(String args) {
        String[] result = args.split(" ");
        setPrice(result[2]);
    }

    public BigDecimal getPrice() {
        return price;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPrice(String price) {
        this.price = Check.checkPrice(price);
    }
}