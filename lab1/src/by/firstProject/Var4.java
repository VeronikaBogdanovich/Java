package by.firstProject;

/* Числа, которые делятся на 5 и на 7*/
public class Var4 {
    public static void Five(int[] arr) {
        System.out.print("\nЧисла, которые делятся на 5: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0)
                System.out.print(arr[i] + " ");
        }
    }

    public static void Seven(int[] arr) {
        System.out.print("\nЧисла, которые делятся на 7: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}
