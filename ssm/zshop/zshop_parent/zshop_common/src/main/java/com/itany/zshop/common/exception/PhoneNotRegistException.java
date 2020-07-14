package com.itany.zshop.common.exception;

/**
 * Author：汤小洋
 * Date：2018-05-15 16:54
 * Description：<描述>
 */
public class PhoneNotRegistException extends Exception {
    public PhoneNotRegistException() {
        super();
    }

    public PhoneNotRegistException(String message) {
        super(message);
    }

    public PhoneNotRegistException(String message, Throwable cause) {
        super(message, cause);
    }

    public PhoneNotRegistException(Throwable cause) {
        super(cause);
    }
}
