package com.mmall.service.ex;

public class ProductInsertException extends ServiceException{
    public ProductInsertException() {
        super();
    }

    public ProductInsertException(String message) {
        super(message);
    }

    public ProductInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductInsertException(Throwable cause) {
        super(cause);
    }

    protected ProductInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
