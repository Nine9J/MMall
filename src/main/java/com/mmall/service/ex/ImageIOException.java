package com.mmall.service.ex;

public class ImageIOException extends ServiceException{
    public ImageIOException() {
        super();
    }

    public ImageIOException(String message) {
        super(message);
    }

    public ImageIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImageIOException(Throwable cause) {
        super(cause);
    }

    protected ImageIOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
