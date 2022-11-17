package com.mmall.service.ex;

public class CartDeleteException extends ServiceException{
    public CartDeleteException() {
        super();
    }

    public CartDeleteException(String message) {
        super(message);
    }

    public CartDeleteException(String message, Throwable cause) {
        super(message, cause);
    }

    public CartDeleteException(Throwable cause) {
        super(cause);
    }

    protected CartDeleteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
