package by.firstProject;

/*Числа, которые делятся на 3 или на 9.*/
public class Var3 {
    public static void Three(int[] arr) {
        System.out.print("\nЧисла, которые делятся на 3: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0)
                System.out.print(arr[i] + " ");
        }
    }

    public static void Nine(int[] arr) {
        System.out.print("\nЧисла, которые делятся на 9: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 9 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}
