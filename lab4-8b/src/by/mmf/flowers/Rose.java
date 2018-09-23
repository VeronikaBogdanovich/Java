package by.mmf.flowers;

import java.math.BigDecimal;

public class Rose extends Flower {
    private String name = "Роза";

    public Rose(String fresh, BigDecimal price, int lenOfStalk) {
        super(fresh, price, lenOfStalk);
    }

    public Rose( String name, String args) {
        super(args);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Название: " + name + " Степень свежести: "
                + getFresh() + " Цена: " + getPrice()
                + " Длина стебля: " + getLenOfStalk()+"\n";
    }
}
