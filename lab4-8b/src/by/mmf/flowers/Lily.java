package by.mmf.flowers;

import java.math.BigDecimal;

public class Lily extends Flower {
    private String name = "Лилия";

    public Lily(String fresh, BigDecimal price, int lenOfStalk) {
        super(fresh, price, lenOfStalk);
    }

    public Lily( String name, String args) {
        super(args);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Название: " + name + " Степень свежести: "
                + getFresh() + " Цена: " + getPrice()
                + " Длина стебля: " + getLenOfStalk() + "\n";
    }
}
