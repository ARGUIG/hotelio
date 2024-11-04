package com.arguig.hotelio.exception;

/**
 * @author arguig
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
