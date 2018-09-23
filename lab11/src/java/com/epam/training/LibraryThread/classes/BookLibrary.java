package java.com.epam.training.LibraryThread.classes;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Библиотека
 */
public class BookLibrary {
//    static Logger libraryLogger = LogManager.getLogger(BookLibrary.class.getName());

    private static final int TIME_BY_READY = 2000; // среднее время для чтения книги

    // количество книг в библиотеке для свободной выдачи на руки для чтения
    private int booksFreeCount;
    // количество книг в библиотеке для чтения в читальном зале
    private int booksByReadyRoomCount;
    // список книг в библиотеке
    private List<com.epam.training.LibraryThread.classes.Book> lstBooksLibrary = new ArrayList<>();

    // количество читателей в библиотеке
    private int peoplesCount;
    // список читателей библиотеки
    private List<com.epam.training.LibraryThread.classes.PeopleReader> lstPeoplesReader = new ArrayList<>();
    private List<Thread> threadsPeoplesReader = new ArrayList<>();

    // конструктор
    public BookLibrary(int booksFreeCount, int booksByReadyRoomCount, int peoplesCount) {
        // заполним книги, которые можно читать вне библиотеки
        this.booksFreeCount = booksFreeCount;
//        libraryLogger.info("Add books by free ready to library...");
        fillBooksLibrary(false, booksFreeCount);

        // заполним книги, которые можно читать в читальном зале библиотеки
        this.booksByReadyRoomCount = booksByReadyRoomCount;
//        libraryLogger.info("Add books by ready room to library...");
        fillBooksLibrary(true, booksByReadyRoomCount);

        // заполним список читателей библиотеки
//        libraryLogger.info("Add peoples readers to library...");
        for (int i = 0; i < peoplesCount; i++) {
            com.epam.training.LibraryThread.classes.PeopleReader people = new com.epam.training.LibraryThread.classes.PeopleReader("People" + i, lstBooksLibrary);
            lstPeoplesReader.add(people);
        }
    }

    // геттеры
    public List<com.epam.training.LibraryThread.classes.Book> getLstBooksLibrary() {
        return lstBooksLibrary;
    }

    public List<com.epam.training.LibraryThread.classes.PeopleReader> getLstPeoplesReader() {
        return lstPeoplesReader;
    }

    // метод заполняет список книг в библиотеке
    private void fillBooksLibrary(boolean byReadyRoom, int count) {
        int firstIndex = lstBooksLibrary.size();

        for (int i = firstIndex; i < (firstIndex) + count; i++) {
            com.epam.training.LibraryThread.classes.Book book = new com.epam.training.LibraryThread.classes.Book("Book" + i, byReadyRoom, new Random().nextInt(TIME_BY_READY));
            lstBooksLibrary.add(book);
        }
    }

    // метод запускает работу библиотеки и инициирует потоки действий читателей
    public void startWorkLibrary() throws InterruptedException {
        for (com.epam.training.LibraryThread.classes.PeopleReader people : lstPeoplesReader) {
            // запустим поток действий читателя
            Thread thread = new Thread(people);
            threadsPeoplesReader.add(thread);
            thread.start();
        }

        int countThreads = threadsPeoplesReader.size();

        // ждем завершения работы всех потоков действий читателей
        while (countThreads > 0) {
            for (Thread thd : threadsPeoplesReader) {
                if (thd.getState() == Thread.State.TERMINATED) {
                    countThreads --;
                }

                Thread.sleep(200);
            }
        }
    }

}
