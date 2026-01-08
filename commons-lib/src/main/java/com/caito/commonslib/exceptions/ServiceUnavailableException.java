package com.caito.commonslib.exceptions;

/*
 * ServiceUnavaiable is a custom exception that indicates a service is currently unavailable.
 *
 * @author caito
 *
 */
public class ServiceUnavailableException extends RuntimeException{
    public ServiceUnavailableException(String message) {
        super(message);
    }
}
