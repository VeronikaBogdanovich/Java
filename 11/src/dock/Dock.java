package dock;

public interface Dock {
    int load(int max); //загрузка

    boolean place(int weight); // разгрузка

    boolean dock(); // причалить

    void sail(); // отплыть
}
