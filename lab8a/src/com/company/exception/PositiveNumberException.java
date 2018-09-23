package com.company.exception;

public class PositiveNumberException extends Exception {
    public PositiveNumberException() {
    }

    public PositiveNumberException(String message) {
        super(message);
    }

    public PositiveNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public PositiveNumberException(Throwable cause) {
        super(cause);
    }

    public PositiveNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
