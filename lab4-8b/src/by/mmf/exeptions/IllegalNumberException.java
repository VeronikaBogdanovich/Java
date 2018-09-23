package by.mmf.exeptions;

public class IllegalNumberException extends Exception {
    public IllegalNumberException() {
    }

    public IllegalNumberException(String message) {
        super(message);
    }

    public IllegalNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalNumberException(Throwable cause) {
        super(cause);
    }

    public IllegalNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
