package by.firstProject;

/*Наибольшее и наименьшее число*/
public class Var2 {
    public static void Max(int[] arr) {
        System.out.print("\nМаксимальное число: ");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.print(max);
    }

    public static void Min(int[] arr) {
        System.out.print("\nМинимальное число: ");
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.print(min);
    }
}
