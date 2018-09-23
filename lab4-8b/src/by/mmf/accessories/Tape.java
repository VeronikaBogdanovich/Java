package by.mmf.accessories;

import by.mmf.check.Check;

import java.math.BigDecimal;

public class Tape extends Accessories {

    private String type = "Лента";
    private int len = 0;

    public int getLen() {
        return len;
    }

    public Tape(int len) {
        this.len = len;
    }

    public Tape(String type, int len) {
        this.type = type;
        this.len = len;
    }

    public Tape(BigDecimal price, String type, int len) {
        super(price);
        this.type = type;
        this.len = len;
    }

    public Tape(String args, String type) {
        super(args);
        String[] result = args.split(" ");
        setLen(result[1]);
        this.type = type;
    }

    public void setLen(int len) {
        this.len = len;
    }
    public void setLen(String len) {
        this.len = Check.checkLen(len);
    }
    @Override
    public String toString() {
        return "Название: " + type + " Длинна:  " + len +
                " Стоймость: " + getPrice()+"\n";
    }
}
