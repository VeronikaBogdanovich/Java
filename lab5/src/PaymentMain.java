
import java.io.IOException;
public class PaymentMain
{
    public static void main(String [] args) throws IOException
    {
        try
        {
            Payment pay1 = new Payment("Первая покупка");
            pay1.setPayment();
            Payment pay2 = new Payment("Вторая покупка");
            pay2.setPayment();
            pay1.printCheque();
            pay2.printCheque();
        }
        catch(NumberFormatException e)
        {
            System.out.println("Неверный формат");
        }
        catch(NullPointerException e)
        {
            System.out.println("Массив не создан");
        }
    }
}