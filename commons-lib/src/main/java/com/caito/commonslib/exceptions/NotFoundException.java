package com.caito.commonslib.exceptions;

/**
 * Custom exception class for handling not found errors in the application.
 * This exception is thrown when a requested resource cannot be found.
 *
 * @author caito
 *
 */
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
