package by.firstProject;

/* Элементы, расположенные методом пузырька по убыванию модулей*/
public class Var5 {
    public static void Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (Math.abs(arr[j]) > Math.abs(arr[j - 1])) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        System.out.print("\nСортировка: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
