import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *Created by Veronika on 28.02.2018.
 */

/*Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
Номер банковского счета.
Создать массив объектов. Вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится
в заданном интервале.*/

public class Customers {


    public static void main(String[] args) {

        Shop market = new Shop("Keshenya");

        market.addCustomerToShopList(new Customer("Дмитрий", "Имануилов", "Алексеевич", 60_45_48, 4589));
        market.addCustomerToShopList(new Customer("Василий", "Тарасенко", "Петрович", 25_45_48, 1668));
        market.addCustomerToShopList(new Customer("Алесей", "Колесник", "Андреевич", 30_45_89, 1598));
        market.addCustomerToShopList(new Customer("Борис", "Македон", "Вадимович", 90_47_48, 4785));
        market.addCustomerToShopList(new Customer("Дмитрий", "Турецкий", "Федорович", 40_45_45, 2569));


        System.out.println("\nsort by name:");
        List<Customer> listSortByName = market.getListName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nsort by surname:");
        List<Customer> listSortBySurname = market.getListSurname();
        for (Customer c : listSortBySurname) {
            System.out.println(c);
        }

        System.out.println("\ndiapason card number:");
        List<Customer> diapasonCardumber = market.getListDiapasonCardNumber(254548, 554556);
        for (Customer c : diapasonCardumber) {
            System.out.println(c);
        }
    }
}

class Shop {

    private String ShopName;
    private ArrayList<Customer> customerList = new ArrayList<>();

    Shop(String ShopName) {
        this.ShopName = ShopName;
    }

    void addCustomerToShopList(Customer customer) {
        customerList.add(customer);
    }

    List<Customer> getListName() {
        List<Customer> list = new ArrayList<>(customerList);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }

        });
        return list;
    }

    public Shop(String shopName, ArrayList<Customer> customerList) {
        ShopName = shopName;
        this.customerList = customerList;
    }

    List<Customer> getListSurname() {

        List<Customer> list = new ArrayList<>(customerList);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSurname().compareToIgnoreCase(o2.getSurname());
            }
        });
        return list;
    }

    List<Customer> getListDiapasonCardNumber(int diapasonStart, int diapasonEnd) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customerList) {
            if (c.getCardNumber() >= diapasonStart && c.getCardNumber() <= diapasonEnd) {
                list.add(c);
            }
        }
        return list;
    }

}

class Customer {

    {
        idGenertor++;
    }

    private static int idGenertor = 0;
    private int id = idGenertor;
    private String surname;
    private String name;
    private String patronymic;
    private int CardNumber;
    private int BankNumber;

    public static void setIdGenertor(int idGenertor) {
        Customer.idGenertor = idGenertor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setCardNumber(int cardNumber) {
        CardNumber = cardNumber;
    }

    public void setBankNumber(int bankNumber) {
        BankNumber = bankNumber;
    }

    Customer(String surname, String name, String patronymic, int CardNumber, int BankNumber) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.CardNumber = CardNumber;
        this.BankNumber = BankNumber;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public int getBankNumber() {
        return BankNumber;
    }

    public String toString() {
        return String.format("ID: %d\t name: %s\t surname: %s\t patronymic %s \t CardNumber %d\t BankNumber %d",
                id, surname, name, patronymic, CardNumber, BankNumber);
    }

}
