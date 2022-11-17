package com.mmall.service.ex;

public class ImageIsNullException extends ServiceException{
    public ImageIsNullException() {
        super();
    }

    public ImageIsNullException(String message) {
        super(message);
    }

    public ImageIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImageIsNullException(Throwable cause) {
        super(cause);
    }

    protected ImageIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
