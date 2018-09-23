package by.mmf.accessories;

import by.mmf.check.Check;

import java.math.BigDecimal;

public class Paper extends Accessories {
    private String type = "Лента";
    private int list = 0;

    public int getLen() {
        return list;
    }

    public Paper(int len) {
        this.list = len;
    }

    public Paper(String type, int len) {
        this.type = type;
        this.list = len;
    }

    public Paper(BigDecimal price, String type, int len) {
        super(price);
        this.type = type;
        this.list = len;
    }

    public Paper(String args, String type) {
        super(args);
        String[] result = args.split(" ");
        setLen(result[1]);
        this.type = type;
    }

    public void setLen(int len) {
        this.list = len;
    }

    public void setLen(String len) {
        this.list = Check.checkLen(len);
    }

    @Override
    public String toString() {
        return "Название: " + type + " Количество листов:  " + list +
                " Стоймость: " + getPrice()+"\n";
    }
}

