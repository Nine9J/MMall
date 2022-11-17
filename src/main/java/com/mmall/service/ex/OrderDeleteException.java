package com.mmall.service.ex;

public class OrderDeleteException extends ServiceException{
    public OrderDeleteException() {
        super();
    }

    public OrderDeleteException(String message) {
        super(message);
    }

    public OrderDeleteException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderDeleteException(Throwable cause) {
        super(cause);
    }

    protected OrderDeleteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
