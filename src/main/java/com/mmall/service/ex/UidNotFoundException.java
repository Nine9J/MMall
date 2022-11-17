package com.mmall.service.ex;

public class UidNotFoundException extends ServiceException{
    public UidNotFoundException() {
        super();
    }

    public UidNotFoundException(String message) {
        super(message);
    }

    public UidNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UidNotFoundException(Throwable cause) {
        super(cause);
    }

    protected UidNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
