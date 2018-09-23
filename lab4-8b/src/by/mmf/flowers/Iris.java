package by.mmf.flowers;

import java.math.BigDecimal;

public class Iris extends Flower {
    private String name = "Ирис";

    public Iris(String fresh, BigDecimal price, int lenOfStalk) {
        super(fresh, price, lenOfStalk);
    }

    public Iris( String name, String args) {
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
