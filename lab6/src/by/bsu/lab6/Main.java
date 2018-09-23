package by.bsu.lab6;

/*Создать и реализовать интерфейсы, также использовать наследование
для следующих предметных областей:
2. interface Абитуриент <- abstract class Студент <- class Студент-Заочник.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k=3;
        System.out.println("Количество студентов: ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();

        EextramuralStudent[] student = new EextramuralStudent[k];

        for (int i=0; i<k; i++){
            student[i] = new EextramuralStudent();
            System.out.println("Введите имя: ");
            student[i].setName();
            System.out.println("Введите фамилию: ");
            student[i].setSurname();
            System.out.println("Введите факультет: ");
            student[i].setFaculty();
        }
        System.out.println();
        for (int i=0; i<k; i++) {
            System.out.println("Студент " + (i+1) + ": ");
            student[i].getFaculty();
            student[i].getName();
            System.out.print(" ");
            student[i].getSurname();
        }

    }
}
