package com.mmall.service.ex;

public class SessionOverdueException extends ServiceException{
    public SessionOverdueException() {
        super();
    }

    public SessionOverdueException(String message) {
        super(message);
    }

    public SessionOverdueException(String message, Throwable cause) {
        super(message, cause);
    }

    public SessionOverdueException(Throwable cause) {
        super(cause);
    }

    protected SessionOverdueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
