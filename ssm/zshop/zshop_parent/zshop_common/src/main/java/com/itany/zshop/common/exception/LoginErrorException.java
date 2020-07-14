package com.itany.zshop.common.exception;

/**
 * Author：汤小洋
 * Date：2018-05-15 14:12
 * Description：<描述>
 */
public class LoginErrorException extends Exception {
    public LoginErrorException() {
        super();
    }

    public LoginErrorException(String message) {
        super(message);
    }

    public LoginErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginErrorException(Throwable cause) {
        super(cause);
    }
}
