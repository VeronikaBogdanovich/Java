package by.firstProject;

/*Четные и нечетные числа*/
public class Var1 {
    public static void Even(int[] arr) {
        System.out.print("\nЧетные числа: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }

    public static void Odd(int[] arr) {
        System.out.print("\nНечетные числа: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                System.out.print(arr[i] + " ");
        }
    }
}
