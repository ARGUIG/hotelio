package com.arguig.hotelio.exception;

/**
 * @author arguig
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}