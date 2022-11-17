package com.mmall.service.ex;

public class CidExistException extends ServiceException{
    public CidExistException() {
        super();
    }

    public CidExistException(String message) {
        super(message);
    }

    public CidExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public CidExistException(Throwable cause) {
        super(cause);
    }

    protected CidExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
