package by.mmf.exeptions;

public class BouquetFileNotFoundException extends Exception {
    public BouquetFileNotFoundException() {
    }

    public BouquetFileNotFoundException(String message) {
        super(message);
    }

    public BouquetFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BouquetFileNotFoundException(Throwable cause) {
        super(cause);
    }

    public BouquetFileNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
