package by.firstProject;
/*
B1. Ввести с консоли n целых чисел. На консоль вывести четные и нечетные числа.
*/
import java.util.Random;

public class Main {
    public static void main(String [] args) {
        Random randNumber = new Random();
        int num = randNumber.nextInt(7) + 3;
        int[] arr = new int[num];
        Array.Fill(arr);
        Var1.Even(arr);
        Var1.Odd(arr);
        Var2.Max(arr);
        Var2.Min(arr);
        Var3.Three(arr);
        Var3.Nine(arr);
        Var4.Five(arr);
        Var4.Seven(arr);
        Var5.Sort(arr);
    }
}

