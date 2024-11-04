package com.arguig.hotelio.exception;

/**
 * @author arguig
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
