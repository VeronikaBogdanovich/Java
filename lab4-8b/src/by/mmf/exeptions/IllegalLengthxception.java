package by.mmf.exeptions;

public class IllegalLengthxception extends Exception {
    public IllegalLengthxception() {
    }

    public IllegalLengthxception(String message) {
        super(message);
    }

    public IllegalLengthxception(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalLengthxception(Throwable cause) {
        super(cause);
    }

    public IllegalLengthxception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
