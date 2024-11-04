package com.arguig.hotelio.exception;

/**
 * @author arguig
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
