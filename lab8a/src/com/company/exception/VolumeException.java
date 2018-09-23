package com.company.exception;

public class VolumeException extends Exception{
    public VolumeException() {
    }

    public VolumeException(String message) {
        super(message);
    }

    public VolumeException(String message, Throwable cause) {
        super(message, cause);
    }

    public VolumeException(Throwable cause) {
        super(cause);
    }

    public VolumeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

