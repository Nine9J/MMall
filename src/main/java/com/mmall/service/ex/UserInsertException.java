package com.mmall.service.ex;

/**数据插入异常*/
public class UserInsertException extends ServiceException{
    public UserInsertException() {
        super();
    }

    public UserInsertException(String message) {
        super(message);
    }

    public UserInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserInsertException(Throwable cause) {
        super(cause);
    }

    protected UserInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
