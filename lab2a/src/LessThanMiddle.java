import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *  <p>Date of get:10.02.2018</p>
 * <p>Date of pass: 17.02.2018</p>
 * @author Veronika.
 * @version 1.0
 * @see java.lang.Class

 */
public class LessThanMiddle {

    public static void main(String[] args) {

        int n = 0;
        /**ВВодим число*/
        while(true){
            System.out.println("Введите количество чисел");
            Scanner sc1 = new Scanner (System.in);
            try{
                n = sc1.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Вы ввели не число");
            }

        }
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);

        /**Инициализация массива str числами*/
        for(int i = 0; i < str.length; i++){
            System.out.println("Введите строку №" + (i+1));
            str[i] = sc2.nextLine();
        }

        float average = 0f;
        /**Считаем общую сумму длин чисел*/
        for(String item : str){
            average += (float) item.length();
        }
        /**Считаем среднее арифметическое суммы длин этих чисел*/
        average /= str.length;

        System.out.println("Средняя длина числа = (" + average + ")");
        for(int i = 0; i < n; i++){
            if (str[i].length() < average){
                System.out.println("Число меньшее чем средняя длина: ");
                System.out.println(str[i] + " eго длина = " + str[i].length());
            }
            else if (str[i].length() > average){
                System.out.println("Число большее чем средняя длина: ");
                System.out.println(str[i] + " eго длина = " + str[i].length());
            }
        }
        System.out.println("author Veronika");
        System.out.println("Date of get: 12.02.2018");
        System.out.println("Date of pass: 12.02.2018");
    }


}

