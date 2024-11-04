package com.arguig.hotelio.exception;

/**
 * @author arguig
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}