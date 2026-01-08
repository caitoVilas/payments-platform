package com.caito.commonslib.exceptions;

/**
 * Custom exception class for wallet-related errors.
 * Extends RuntimeException to represent unchecked exceptions.
 *
 * @author caito
 *
 */
public class WalletException extends RuntimeException{
    public WalletException(String message) {
        super(message);
    }
}
