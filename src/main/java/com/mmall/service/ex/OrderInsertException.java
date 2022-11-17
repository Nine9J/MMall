package com.mmall.service.ex;

public class OrderInsertException extends ServiceException{
    public OrderInsertException() {
        super();
    }

    public OrderInsertException(String message) {
        super(message);
    }

    public OrderInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderInsertException(Throwable cause) {
        super(cause);
    }

    protected OrderInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
