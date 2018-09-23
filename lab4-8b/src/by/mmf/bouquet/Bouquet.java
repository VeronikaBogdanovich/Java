package by.mmf.bouquet;

import by.mmf.accessories.Accessories;
import by.mmf.accessories.Paper;
import by.mmf.accessories.Tape;
import by.mmf.exeptions.*;
import by.mmf.flowers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bouquet {
    private ArrayList<Flower> bouquet = new ArrayList<>();
    private ArrayList<Accessories> acc = new ArrayList<>();

    public Bouquet(ArrayList<Flower> bouquet, ArrayList<Accessories> acc) {
        this.bouquet = bouquet;
        this.acc = acc;
    }

    public ArrayList<Accessories> getAcc() {
        return acc;
    }

    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public Bouquet(File ListFile) {
        try {
            if (!ListFile.exists()) {
                throw new BouquetFileNotFoundException("Файл не найден");
            } else {
                Scanner scanner;
                try {
                    scanner = new Scanner(ListFile);
                    while (scanner.hasNext()) {
                        String name = scanner.next();
                        if (name.equals("Роза")) {
                            String oneLine = scanner.nextLine();
                            bouquet.add(new Rose(name, oneLine));
                        } else if (name.equals("Ирис")) {
                            String oneLine = scanner.nextLine();
                            bouquet.add(new Iris(name, oneLine));
                        } else if (name.equals("Лилия")) {
                            String oneLine = scanner.nextLine();
                            bouquet.add(new Lily(name, oneLine));
                        } else if (name.equals("Лента")) {
                            String oneLine = scanner.nextLine();
                            acc.add(new Tape(oneLine, name));
                        } else if (name.equals("Бумага")) {
                            String oneLine = scanner.nextLine();
                            acc.add(new Paper(oneLine, name));
                        }
                    }
                } catch (FileNotFoundException e) {
                    try {
                        throw new BouquetFileNotFoundException();
                    } catch (BouquetFileNotFoundException e1) {
                        e.printStackTrace();
                    }

                }
            }
        } catch (BouquetFileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < getBouquet().size(); i++) {
            res.append(getBouquet().get(i).toString());
        }
        for (int i = 0; i < getAcc().size(); i++) {
            res.append(getAcc().get(i).toString());
        }
        return res.toString();
    }

    public void sortByFresh() {
        bouquet.sort(Comparator.comparing(Flower::getIntFresh));
    }

    public BigDecimal getPr() {
        BigDecimal price = new BigDecimal(0);
        for (int i = 0; i < getBouquet().size(); i++) {
            price = price.add(getBouquet().get(i).getPrice());
        }
        for (int i = 0; i < getAcc().size(); i++) {
            price = price.add(getAcc().get(i).getPrice());
        }
        return price;
    }

    public Bouquet findAccordLen(int from, int to) {
        ArrayList<Flower> res = new ArrayList<>();
        for (int i = 0; i < getBouquet().size(); i++) {
            if (getBouquet().get(i).getLenOfStalk() >= from && getBouquet().get(i).getLenOfStalk() <= to) {
                res.add(getBouquet().get(i));
            }
        }
        return new Bouquet(res, this.acc);
    }
}


