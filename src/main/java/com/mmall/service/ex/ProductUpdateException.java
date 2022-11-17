package com.mmall.service.ex;

public class ProductUpdateException extends ServiceException{
    public ProductUpdateException() {
        super();
    }

    public ProductUpdateException(String message) {
        super(message);
    }

    public ProductUpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductUpdateException(Throwable cause) {
        super(cause);
    }

    protected ProductUpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
