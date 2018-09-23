package by.mmf.exeptions;

public class IllegalPriceException extends Exception {
    public IllegalPriceException() {
    }

    public IllegalPriceException(String message) {
        super(message);
    }

    public IllegalPriceException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalPriceException(Throwable cause) {
        super(cause);
    }

    public IllegalPriceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
