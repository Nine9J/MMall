package com.mmall.service.ex;

public class ProductDeleteException extends ServiceException{
    public ProductDeleteException() {
        super();
    }

    public ProductDeleteException(String message) {
        super(message);
    }

    public ProductDeleteException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductDeleteException(Throwable cause) {
        super(cause);
    }

    protected ProductDeleteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
