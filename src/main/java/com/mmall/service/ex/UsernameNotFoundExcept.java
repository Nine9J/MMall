package com.mmall.service.ex;

/**未找到用户名异常*/
public class UsernameNotFoundExcept extends ServiceException{
    public UsernameNotFoundExcept() {
    }

    public UsernameNotFoundExcept(String message) {
        super(message);
    }

    public UsernameNotFoundExcept(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameNotFoundExcept(Throwable cause) {
        super(cause);
    }

    public UsernameNotFoundExcept(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
