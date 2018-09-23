package by.mmf.lab;

import by.mmf.bouquet.Bouquet;
import by.mmf.exeptions.BouquetFileNotFoundException;
import by.mmf.exeptions.IllegalNumberException;
import by.mmf.exeptions.IllegalPriceException;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
    public static void GetMenu(Bouquet b) {
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        while (flag) {
            System.out.println("\nВыберете пункт меню: " +
                    "\n1)Просмотреть букет" +
                    "\n2)Отсортировать букет по свежести цветов" +
                    "\n3)Выбрать цветы с заданной длинной стебля" +
                    "\n4)Выход");
            int num = getNumber();
            switch (num) {
                case 1: {
                    seeBouquet(b);
                    break;
                }
                case 2: {
                    sortBouquet(b);
                    break;
                }
                case 3: {
                    System.out.println("Введите длинну стебля (от .. до ..)");
                    int from = in.nextInt();
                    int to = in.nextInt();
                    getBouquetByLen(from, to, b);
                    break;
                }
                case 4: {
                    flag = false;
                    break;
                }
            }
        }
    }

    private static void seeBouquet(Bouquet b) {
        String filePath = "/Users/veronikabogdanovich/Documents/Java/4-8b/src/out1.txt";
        //File f = new File(filePath, "out1.txt");

        try {
            BufferedWriter out;
            out = new BufferedWriter(new FileWriter(filePath));
            out.write("Букет: \n" + b.toString() + "\nЦена: " + b.getPr());
            out.close();
        } catch (FileNotFoundException e) {
            try {
                throw new BouquetFileNotFoundException();
            } catch (BouquetFileNotFoundException e1) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//        System.out.println("\nБукет: ");
//        System.out.print(b.toString());
//        System.out.println("Цена букета: " + b.getPr());


    private static void sortBouquet(Bouquet b) {
        String filePath = "/Users/veronikabogdanovich/Documents/Java/4-8b/src/out2.txt";
        //File f = new File(filePath, "out1.txt");

        try {
            BufferedWriter out;
            out = new BufferedWriter(new FileWriter(filePath));
            b.sortByFresh();
            out.write("Сортировка по свежести: \n" + b.toString());
            out.close();
        } catch (FileNotFoundException e) {
            try {
                throw new BouquetFileNotFoundException();
            } catch (BouquetFileNotFoundException e1) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    private static void getBouquetByLen(int from, int to, Bouquet b) {
        {
            String filePath = "/Users/veronikabogdanovich/Documents/Java/4-8b/src/out3.txt";
            //File f = new File(filePath, "out1.txt");

            try {
                BufferedWriter out;
                out = new BufferedWriter(new FileWriter(filePath));
                b.sortByFresh();
                out.write("Сортировка по длинне стебля: \n" + b.findAccordLen(from, to).toString());
                out.close();
            } catch (FileNotFoundException e) {
                try {
                    throw new BouquetFileNotFoundException();
                } catch (BouquetFileNotFoundException e1) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int getNumber() {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        Pattern regExp = Pattern.compile("\\d");
        Matcher matcher = regExp.matcher(num);
        try {
            if (!matcher.matches()) {
                throw new IllegalNumberException("Неправильный формат");
            }
        } catch (IllegalNumberException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(num);
    }
}
