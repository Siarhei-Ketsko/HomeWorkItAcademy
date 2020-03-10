package com.homework.lesson9;

public class NonexistentTriangleException extends Exception {

    public NonexistentTriangleException() {
    }

    public NonexistentTriangleException(String message) {
        super(message);
    }

    public NonexistentTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonexistentTriangleException(Throwable cause) {
        super(cause);
    }

    public NonexistentTriangleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
