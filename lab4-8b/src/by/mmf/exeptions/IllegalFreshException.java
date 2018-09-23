package by.mmf.exeptions;

public class IllegalFreshException extends Exception {
    public IllegalFreshException() {
    }

    public IllegalFreshException(String message) {
        super(message);
    }

    public IllegalFreshException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalFreshException(Throwable cause) {
        super(cause);
    }

    public IllegalFreshException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
