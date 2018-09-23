package by.firstProject;


import java.util.Random;

public class Array {
    public static void Fill(int[] arr) {
        Random randNumber = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randNumber.nextInt(30) - 15;
        }
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
