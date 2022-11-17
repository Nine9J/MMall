package com.mmall.service.ex;

public class CartInsertException extends ServiceException{
    public CartInsertException() {
        super();
    }

    public CartInsertException(String message) {
        super(message);
    }

    public CartInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public CartInsertException(Throwable cause) {
        super(cause);
    }

    protected CartInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
