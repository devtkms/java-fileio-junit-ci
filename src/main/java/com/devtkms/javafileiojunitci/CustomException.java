package com.devtkms.javafileiojunitci;

/**
 * CustomException is a custom exception class extending Exception.
 */
public class CustomException extends Exception {

    /**
     * Constructor that takes a custom message when the exception is thrown.
     *
     * @param message the custom message for the exception
     */
    public CustomException(String message) {
        super(message);  // Call the superclass constructor to pass the message.
    }
}